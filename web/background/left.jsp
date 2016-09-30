<!DOCTYPE html>
<html>
<head>
    <meta content="text/html; charset=utf-8" http-equiv="Content-Type"/>
    <title>主界面</title>
    <link type="text/css" href="css/base.css" rel="stylesheet"/>
    <link type="text/css" href="css/style.css" rel="stylesheet"/>
</head>
<body>
<div class="sidebar_lt">

    <ul class="sidebar_list">
        <li><a class="list_item list_current">网站后台帐号登陆</a>
            <ul id="u1">
                <li><a href="twoStage/login.jsp" target="link">管理员登陆</a></li>
                <!--<li><a href="admin_useradd.html" target="link">管理员帐号添加</a></li>-->
                <!--<li><a href="admin_datalist.html" target="link">后台帐号资料管理</a></li>		   -->
                <!--<li><a href="admin_rightlist.html" target="link">后台帐号权限管理</a></li>		   		  -->
                <!--<li><a href="basic_setup.html" target="link">基本设置</a></li>-->
            </ul>
        </li>
        <li><a class="list_item">游客订单管理</a>
            <ul class="fn-hide" id="u2">
                <li><a href="twoStage/order_listing.jsp" target="link">进行中的订单</a></li>
                <li><a href="twoStage/order_listed.jsp" target="link">已完成的订单</a></li>
            </ul>
        </li>
        <li><a class="list_item">玉龙雪山首页管理</a>
            <ul class="fn-hide" id="u3">
                <li><a href="twoStage/slide_manage.jsp" target="link">首页幻灯片管理</a></li>

                <li><a href="twoStage/news_list.jsp" target="link">新闻动态管理</a></li>
                <%--<li><a href="twoStage/activity_add.jsp" target="link">添加活动</a></li>--%>
                <li><a href="twoStage/activity_list.jsp" target="link">活动动态管理</a></li>
                <%--<li><a href="twoStage/announce_add.jsp" target="link">添加公告</a></li>--%>
                <li><a href="twoStage/announce_list.jsp" target="link">公告动态管理</a></li>
                <li><a href="twoStage/context_add.jsp" target="link">添加内容</a></li>
                <!--<li><a href="message_list.html" target="link">首页留言管理</a></li>-->
                <!--<li><a href="twoStage/ad_manage.html" target="link">广告宣传图片管理</a></li>-->
                <!--<li><a href="links_list.html" target="link">友情链接管理</a></li>-->
            </ul>
        </li>
        <li><a class="list_item">景区路线管理</a>
            <ul class="fn-hide" id="u4">
                <li><a href="twoStage/xspath_list.jsp" target="link">雪山景区路线</a></li>
                <li><a href="twoStage/dylpath_list.jsp" target="link">大玉龙路线</a></li>
                <li><a href="twoStage/path_add.jsp" target="link">添加路线</a></li>
            </ul>
        </li>
        <li><a class="list_item">资源文化</a>
            <ul class="fn-hide" id="u5">
                <li><a href="twoStage/history_list.jsp" target="link">历史沿革</a></li>
                <li><a href="twoStage/dbculture_list.jsp" target="link">东巴文化</a></li>
                <li><a href="twoStage/nxmusic_list.jsp" target="link">纳西古乐</a></li>
                <li><a href="twoStage/custom_list.jsp" target="link">民风民俗</a></li>
                <li><a href="twoStage/culture_add.jsp" target="link">添加板块</a></li>
            </ul>
        </li>
        <%--<li><a class="list_item">网站统计</a>--%>
        <%--<ul class="fn-hide" id="u6">--%>
        <%--<li><a href="twoStage/statistics_flow.jsp" target="link">网站流量数据</a></li>--%>
        <%--<li><a href="twoStage/statistics_action.jsp" target="link">用户行为数据</a></li>--%>
        <%--</ul>--%>
        <%--</li>--%>
        <li><a class="list_item">关于我们</a>
            <ul class="fn-hide" id="u7">
                <%--<li><a href="twoStage/attentionthey_list%20.jsp" target="link">相册管理</a></li>--%>
                <li><a href="twoStage/tourservice_list.jsp" target="link">旅游服务</a></li>
                <li><a href="twoStage/service_add.jsp" target="link">添加内容</a></li>
                <!--<li><a href="operating_record.html" target="link">医疗救援</a></li>-->
                <!--<li><a href="operating_record.html" target="link">质量监督</a></li>-->
                <!--<li><a href="operating_record.html" target="link">旅游指数</a></li>-->
            </ul>
        </li>
    </ul>
</div>
<script type="text/javascript" src="js/jquery-1.4.4.js" language="javascript"></script>
<script type="text/javascript" src="js/tab.js"></script>
</body>
</html>
