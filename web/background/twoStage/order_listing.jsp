<!DOCTYPE html>
<html>
<head>
    <meta content="text/html; charset=utf-8" http-equiv="Content-Type"/>
    <title>游客订单管理</title>
    <link type="text/css" href="../css/base.css" rel="stylesheet"/>
    <link type="text/css" href="../css/style.css" rel="stylesheet"/>
    <script type="text/javascript" src="../../js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="../../js/angular.min.js"></script>
    <script type="text/javascript">

        function finish() {
            var id = $(".check:checked").parent().next().text();
//            alert(id);
            if (id==""){
                alert("请选定订单！")
            }else {

                alert("OK");
                $.ajax({
                    type: "post",
                    url: "../../finish",
                    data: {id: id},
                    success: function () {
                        history.go(0);
                    }
                })
            }

        }
        function del(){
            var id = $(".check:checked").parent().next().text();
            if (id==""){
                alert("请选定订单！")
            }else {
                alert("OK");
                $.ajax({
                    type: "post",
                    url: "../../del",
                    data: {id: id},
                    success: function () {
                        history.go(0);
                    }
                })
            }
        }
        function edit(){
            var id = $(".check:checked").parent().next().text();
            if (id==""){
                alert("请选定订单！")
            }else {
                alert("OK");
                $.ajax({
                    type: "post",
                    url: "../../edit",
                    data: {id: id},
                    success: function () {
                        window.location.href="../Order_edit.jsp";
                    }
                })
            }
        }
    </script>
</head>
<body ng-app="myApp" ng-controller="nameCtrl">
<div class="container">
    <div class="layout">
        <div class="title">
            <h2>进行中的订单：</h2>
        </div>
        <div class="main">
            <form target="" class="addresser">
                <div class="usermanage">
                    <div class="tips">
                        <p>1、订单完成和取消为安全期间不可做批量处理，点击操作后后弹出提示框问告知是否操作此订单成功。</p>
                        <p>2、查找内容可按 id 用户名和创建日期等内容查找格式为例：（12月14日）。</p>
                        <a href="#" class="tip_close"></a>
                    </div>
                    <div class="toolbg toolbgline" style="background-image:none;">
                        <div class="input_left">
                            <input type="button" class="wd1 btn btn_true" value="订单取消" onclick="del()" tabindex="2"/>
                            <select tabindex="3" class="mail_mod">
                                <option value="1">订单编号</option>
                                <option value="3">姓名</option>
                                <option value="4">身份证号</option>
                                <option value="5">电话号码</option>
                                <option value="6">创建日期</option>
                            </select>
                            <input type="test" class="query_text"/>
                            <input type="button" class="btn" value=" 查找 " tabindex="11"/>
                            <a href="search_particular.html">高级搜索</a>
                        </div>
                        <div class="toolbgline_right">1/
                            49 页&nbsp;
                            <a href="#" id="nextpage" accesskey="n">下一页</a>&nbsp;
                            <input type="text" name="" class="input_left_text"/>
                            <a _mljump_="1" href="#" id="maillistjump" name="maillistjump" title="跳转到指定一页">跳转</a>
                        </div>
                    </div>
                    <table cellspacing="0" cellpadding="0" style="table-layout:fixed;" class="O2">
                        <tbody>
                        <tr>
                            <td width="3%" style="padding:1px 0 1px 7px;">

                            </td>
                            <td class="o_title2" style="width:6%;">
                                <a href="#" target="actionFrame">订单编号</a>
                            </td>
                            <td class="o_title2" style="width:18%;">
                                <a href="#" target="actionFrame">项目名称</a>
                            </td>
                            <td class="o_title2" style="width:6%;">
                                <a href="#" target="actionFrame">项目单价</a>
                            </td>
                            <td class="o_title2" style="width:6%;">
                                <a href="#" target="actionFrame">项目数量</a>
                            </td>
                            <td class="o_title2" style="width:6%;">
                                <a href="#" target="actionFrame">订单总价</a>
                            </td>
                            <td class="o_title2" style="width:10%">
                                <a href="#" target="actionFrame">姓名</a>
                            </td>
                            <td class="o_title2" style="width:12%">
                                <a href="#" target="actionFrame">身份证号</a>
                            </td>
                            <td class="o_title2" style="width:10%;">
                                <a href="#" target="actionFrame">电话号码</a>
                            </td>
                            <%--<td class="o_title2" style="width:20%;">--%>
                            <%--<a href="#" target="actionFrame">联系人邮箱</a>--%>
                            <%--</td>--%>
                            <td class="o_title2" style="width:10%;">
                                <div><a href="#" target="actionFrame">创建日期↓</a></div>
                            </td>
                            <td class="o_title2" style="width:10%;">
                                <div><a href="#" target="actionFrame">操作</a></div>
                            </td>
                        </tr>
                        <tr class="tint2" ng-repeat="x in orders">
                            <td class="t_title2 cbox_td">
                                <input type="checkbox" title="选中/取消选中" class="check"/>
                            </td>
                            <td><input type="hidden" name="id" value="{{x.id}}">{{x.id}}</td>
                            <td><input type="hidden" name="goodsName" value="{{x.goodsName}}">{{x.goodsName}}</td>
                            <td><input type="hidden" name="goodsPrice" value="{{x.goodsPrice}}">{{x.goodsPrice}}</td>
                            <td><input type="hidden" name="goodsNum" value="{{x.goodsNum}}">{{x.goodsNum}}</td>
                            <td><input type="hidden" name="money" value="{{x.money}}">{{x.money}}</td>
                            <td><input type="hidden" name="name" value="{{x.name}}">{{x.name}}</td>
                            <td><input type="hidden" name="port" value="{{x.port}}">{{x.port}}</td>
                            <td><input type="hidden" name="tel" value="{{x.tel}}">{{x.tel}}</td>
                            <%--<td>{{x.email}}</td>--%>
                            <td>{{x.date}}</td>
                            <td class="t_title2">
                                <a href="#" onclick="finish()">订单完成</a>
                            </td>
                        </tr>

                    </table>
                    <input type="button" value="订单修改" onclick="edit()">


                </div>
            </form>
        </div><!--end main-->
    </div>
</div>
</body>
</html>
<script type="text/javascript">
    angular.module('myApp', []).controller('nameCtrl', function ($scope, $http) {
        var url = "../../api/orders/ing";
        $http.get(url).success(function (response) {
            $scope.orders = response;
        });
    });

</script>