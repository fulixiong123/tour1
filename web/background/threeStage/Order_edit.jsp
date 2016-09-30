<!DOCTYPE html>
<html>
<head>
    <meta content="text/html; charset=utf-8" http-equiv="Content-Type"/>
    <title>订单修改</title>
    <link type="text/css" href="../css/base.css" rel="stylesheet"/>
    <link type="text/css" href="../css/style.css" rel="stylesheet"/>
    <link type="text/css" href="../css/manage.css" rel="stylesheet"/>
    <link type="text/css" href="../css/acc_management.css" rel="stylesheet"/>
    <script type="text/javascript" src="../../js/jquery-1.8.3.min.js"></script>

</head>
<body>
<form action="add.do" method="post" enctype="multipart/form-data">
<div class="container">
    <div class="layout">
        <div class="title">
            <h2>订单修改：</h2>
        </div>
        <div class="main">
            <form target="" action="" name="" class="addresser">
                <div class="search_table">
                    <table>
                        <tbody>
                        <tr>
                            <th class="table_th1"><span>姓名：</span></th>
                            <td><input class="news_title" name="name" type="text"/></td>
                        </tr>
                        <tr>
                            <th class="table_th1"><span>身份证号：</span></th>
                            <td><input class="news_title" name="name" type="text"/></td>
                        </tr>
                        <tr>
                            <th class="table_th1"><span>电话号码：</span></th>
                            <td><input class="news_title" name="name" type="text"/></td>
                        </tr>
                        <tr>
                            <th class="table_th1"><span>类型：</span></th>
                            <td>
                                <select tabindex="3" class="mail_mod" name="type">
                                    <option value="47">大玉龙雪山景区联票</option>
                                    <option value="48">鼓浪屿往返船票</option>
                                    <option value="49">白水洋、鸳鸯溪、小鲤鱼溪</option>
                                    <option value="50">双人贝壳梦幻世界门票</option>
                                    <option value="51">厦门庐山大酒店1晚</option>
                                    <option value="52">双人世界名人蜡像馆门票</option>
                                </select>
                        </tr>
                        <tr>
                            <th class="table_th1"><span>有效日期：</span></th>
                            <td>
                                <div class="panel_content">
                                    <input class="Wdate" type="text" name="date" onclick="WdatePicker()">
                                    到
                                    <input class="Wdate" type="text" onclick="WdatePicker()">
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <th class="table_th1"><span>上传内容图片：</span></th>
                            <td>
                                <div class="panel_content">
                                    <input type="file" class="in_h" size="40" onpaste="return false;"
                                           onkeydown="return false;" name="pic">
                                    <span class="remark_g">请上传一张图片！</span>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <th class="table_th1" id="context"><span>内容：</span></th>
                            <td>
                                <div class="news_editor">
                                    <textarea style="width: 100%;height: 100%" name="context"></textarea>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <th class="table_th1"></th>
                            <td class="mbtd">
                                <button type="submit">确定提交</button>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </form>
        </div><!--end main-->
    </div>
</div>
</form>
</body>

<script type="text/javascript" src="../js/jquery-1.4.4.js"></script>
<script type="text/javascript" src="../datepicker/WdatePicker.js"></script>

</html>
<script type="text/javascript">
    $window().onload(function(){
        $("#")
    })
</script>