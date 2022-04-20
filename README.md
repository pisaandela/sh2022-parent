# ShangHai lockdown ,快团团，团购表格整理
## 简介
进行团购后，为了方便送货，把快团团上的订单进行整理，根据小区的楼栋顺序进行排序，然后根据表格配送即刻，也可以放入腾讯文档在手机上操作。

## 主要逻辑
1. 把小区的送货线路提前规划好，提前做好顺序排列作为配送顺序，有2个顺序，楼栋顺序和单元楼顺序。
2. 从小区、楼栋、单元，老小区并不需要排到室，因为我所在小区是老房子，大部分6层楼，如果是多层，则需要到室，可根据自己情况修改，作为基础数据。
3. 表格内的订单数据，全部存到订单表。
4. 根据团购编号查询订单数据，关联出产品名称、楼栋顺序，根据楼栋顺序、单元顺序、室进行排序，然后导出为表格。
5. 贴到腾讯文档，送货时在手机上进行操作。

## 感谢
感谢快速脚手架 [spring-boot-api-project-seed](https://github.com/lihengming/spring-boot-api-project-seed/)

## 用法
1. 修改表格内的字段表头,增加`groupNo`列，填写团购的编号的编号。
2. 访问：[http://localhost:8081/group/importExcelData/{表名}](http://localhost:8081/group/importExcelData/{表名}) ，成功后得到团购的group结果数据，取`groupNo`用于接下来的url访问
3. 访问：[http://localhost:8081/order/getByGroupNo/{groupNo}](http://localhost:8081/order/getByGroupNo/{groupNo})
4. 找到目录下对应的文件`doc\temp\xxxxx.xlsx`
