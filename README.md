# 快团团，团购表格整理
## 简介
进行团购后，为了方便送货，把快团团上的订单进行整理，根据小区的楼栋顺序进行排序，然后根据表格配送即刻，也可以放入腾讯文档在手机上操作。

## 感谢
感谢快速脚手架 [spring-boot-api-project-seed](https://github.com/lihengming/spring-boot-api-project-seed/)

## 用法
1. 访问：[http://localhost:8081/group/importExcelData/{表名}](http://localhost:8081/group/importExcelData/{表名}) ，成功后得到团购的group结果数据，取`groupNo`用于接下来的url访问
2. 访问：[http://localhost:8081/order/getByGroupNo/{groupNo}](http://localhost:8081/order/getByGroupNo/{groupNo})
3. 找到目录下对应的文件`doc\temp\xxxxx.xlsx`
