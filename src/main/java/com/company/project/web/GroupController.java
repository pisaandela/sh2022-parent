package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Group;
import com.company.project.service.GroupService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 团购信息
 * Created by author on 2022/04/17.
 */
@RestController
@RequestMapping("/group")
public class GroupController {
    @Resource
    private GroupService groupService;

    @PostMapping
    public Result add(@RequestBody Group group) {
        groupService.save(group);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        groupService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody Group group) {
        groupService.update(group);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        Group group = groupService.findById(id);
        return ResultGenerator.genSuccessResult(group);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Group> list = groupService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/importExcelData/{excelName}")
    public Result importExcelData(@PathVariable String excelName) {
        Group group = groupService.importExcelData(excelName);
        return ResultGenerator.genSuccessResult(group);
    }
}
