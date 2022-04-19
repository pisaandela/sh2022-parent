package com.company.project.web;

import cn.hutool.core.util.StrUtil;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Group;
import com.company.project.model.Order;
import com.company.project.model.OrderConfirmVo;
import com.company.project.model.OrderVo;
import com.company.project.service.GroupService;
import com.company.project.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by author on 2022/04/16.
 */
@CrossOrigin
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService orderService;
    @Resource
    private GroupService groupService;

    @PostMapping
    public Result add(@RequestBody Order order) {
        orderService.save(order);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        orderService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Order order) {
        orderService.update(order);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Order order = orderService.findById(id);
        return ResultGenerator.genSuccessResult(order);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Order> list = orderService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }


    @GetMapping("/getByProductNo/{productNo}")
    public Result getByProductNo(@PathVariable String productNo) {
        List<OrderVo> list = orderService.getByProductNo(productNo);
        List<OrderConfirmVo> result = Lists.newArrayList();
        Map<String, List<OrderVo>> collect = list.stream()
                .collect(Collectors.groupingBy(order -> order.getSort() + "-" + order.getAddressNo() + "-" + order.getFloorNo()));

        collect.forEach((k, v) -> {
            List<String> split = StrUtil.split(k, '-');
            OrderConfirmVo orderConfirmVo = new OrderConfirmVo();
            orderConfirmVo.setOrderTitle(split.get(1) + "弄" + split.get(2));
            orderConfirmVo.setAddressNo(split.get(1));
            orderConfirmVo.setFloorNo(split.get(2));
            orderConfirmVo.setOrderList(v);

            orderConfirmVo.setSort(Integer.parseInt(split.get(0)));
            result.add(orderConfirmVo);
        });
        return ResultGenerator.genSuccessResult(result.stream().sorted(Comparator.comparing(OrderConfirmVo::getSort)).collect(Collectors.toList()));
    }

    @GetMapping("/getByGroupNo/{groupNo}")
    public Result getByGroupNo(@PathVariable String groupNo) {
        // 查询团购数据数据
        Group group = groupService.findBy("groupNo", groupNo);
        // 查询订单数据
        List<OrderVo> list = orderService.getByGroup(group);
        // 导出excel表格
        orderService.exportToExcel(group, list);
        // 返回给手机端的结果数据
        List<OrderConfirmVo> result = Lists.newArrayList();
        Map<String, List<OrderVo>> collect = list.stream()
                .collect(Collectors.groupingBy(order -> order.getSort() + "-" + order.getAddressNo() + "-" + order.getFloorNo()));

        collect.forEach((k, v) -> {
            List<String> split = StrUtil.split(k, '-');
            OrderConfirmVo orderConfirmVo = new OrderConfirmVo();
            orderConfirmVo.setOrderTitle(split.get(1) + "弄" + split.get(2));
            orderConfirmVo.setAddressNo(split.get(1));
            orderConfirmVo.setFloorNo(split.get(2));
            orderConfirmVo.setOrderList(v);

            orderConfirmVo.setSort(Integer.parseInt(split.get(0)));
            result.add(orderConfirmVo);
        });
        return ResultGenerator.genSuccessResult(result.stream().sorted(Comparator.comparing(OrderConfirmVo::getSort)).collect(Collectors.toList()));
    }
}
