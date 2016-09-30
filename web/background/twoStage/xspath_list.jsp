<!DOCTYPE html>
<html>
<head>
    <meta content="text/html; charset=utf-8" http-equiv="Content-Type"/>
    <title>雪山景区路线</title>
    <link type="text/css" href="../css/base.css" rel="stylesheet"/>
    <link type="text/css" href="../css/style.css" rel="stylesheet"/>
    <script type="text/javascript" src="../../js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="../../js/angular.min.js"></script>
    <script type="text/javascript">

        function del(){
            var id = $(".check:checked").parent().next().attr("id");
            alert(id);
            if (id==""){
                alert("请选定项目！")
            }else {
                alert("OK");
                $.ajax({
                    type: "post",
                    url: "../../delcontext",
                    data: {id: id},
                    success: function () {
                        history.go(0);
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
            <h2>雪山景区路线管理：</h2>
        </div>
        <div class="main">
            <form target="" action="" name="" class="addresser">
                <div class="usermanage">
                    <div class="tips">
                        <p>1、权限修改和删除为安全期间不可做批量处理，点击帐号删除后后弹出警示框问知否要删除此帐号。</p>
                        <p>2、查找内容可按 id 用户名和创建日期超找格式为例：（12月14日）。</p>
                        <a href="#" class="tip_close"></a>
                    </div>
                    <div class="toolbg toolbgline" style="background-image:none;">
                        <div class="input_left">
                            <input type="button" onclick="del()" class="wd1 btn btn_true" value="删除" tabindex="2"/>
                            <select tabindex="3" class="mail_mod">
                                <option value="1">编号</option>
                                <option value="2">用户名</option>
                                <option value="3">创建日期</option>
                            </select>
                            <input type="test" class="query_text"/>
                            <input type="button" class="btn" value=" 查找 " tabindex="11"/>
                        </div>
                        <div class="toolbgline_right">1/
                            49 页&nbsp;
                            <a href="" id="nextpage" title="" accesskey="n">下一页</a>&nbsp;
                            <input type="text" name="" class="input_left_text"/>
                            <a _mljump_="1" href="#" id="maillistjump" name="maillistjump" title="跳转到指定一页">跳转</a>
                        </div>
                    </div>
                    <table cellspacing="0" cellpadding="0" style="table-layout:fixed;" class="O2">
                        <tbody>
                        <tr>
                            <td width="3%" class="cbox_td" style="padding:1px 0 1px 7px;">

                            </td>
                            <td class="o_title2" style="width:8%;">
                                <a href="#" target="actionFrame">编号</a>
                            </td>

                            <td class="o_title2" style="width:12%">
                                <a href="#" target="actionFrame">标题名称</a>
                            </td>
                            <td class="o_title2" style="width:10%;">
                                <a href="#" target="actionFrame">操作人ID</a>
                            </td>
                            <td class="o_title2" style="width:50%;">
                                <div><a href="#" target="actionFrame">简介</a></div>
                            </td>
                            <td class="o_title2" style="width:11%;">
                                <a href="#" target="actionFrame">信息修改</a>
                            </td>
                        </tr>
                        <tr class="tint2" ng-repeat="x in xs">
                            <td class="t_title2 cbox_td">
                                <input class="check" type="checkbox" title="选中/取消选中" />
                            </td>
                            <td class="t_title2" id="{{x.id}}">
                                <a class="" >{{x.id}}</a>
                            </td>

                            <td class="t_title2">
                                {{x.title}}
                            </td>
                            <td class="t_title2">
                                admin
                            </td>
                            <td class="t_title2">
                                {{x.context}}
                            </td>
                            <td class="t_title2">
                                <a href="#">修改</a>
                            </td>
                        </tr>
                    </table>
                </div>
            </form>
        </div><!--end main-->
    </div>
</div>
</body>
</html>
<script type="text/javascript">
    angular.module('myApp', []).controller('nameCtrl', function ($scope, $http) {
        var url = "../../api/context/get/xs";
        $http.get(url).success(function (response) {
            $scope.xs = response;
        });
    });
</script>