<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<title>活动添加</title>
<link type="text/css" href="../css/base.css"rel="stylesheet" />
<link type="text/css" href="../css/style.css" rel="stylesheet" />
<link type="text/css" href="../css/manage.css" rel="stylesheet" />
<link type="text/css" href="../css/acc_management.css" rel="stylesheet" />

</head>
<body>
<div class="container">
 <div class="layout">
	 <div class="title">
	   <h2>活动添加：</h2>
	 </div>
	 <div class="main">
          <form target="" action="" name="" class="addresser">
		    <div class="search_table">	   
			   <table>
				  <tbody>
					  <tr>
					     <th class="table_th1"><span>活动标题：</span></th>
						 <td><input class="news_title" type="test" /></td>
						
					  </tr>
					  <tr>
					     <th class="table_th1"><span>活动类型：</span></th>
						 <td> <select tabindex="3" class="mail_mod">
					       <option value="1">编号</option>
                           <option value="2">用户名</option>
                           <option value="3">创建日期</option>
                    </select> <select tabindex="3" class="mail_mod">
					       <option value="1">编号</option>
                           <option value="2">用户名</option>
                           <option value="3">创建日期</option>
                    </select></td>
					  </tr>
					   <tr>
					     <th class="table_th1"><span>活动有效日期：</span></th>
						 <td><div class="panel_content">
                               <input class="Wdate" type="text" onclick="WdatePicker()">
                                     到 
                               <input class="Wdate" type="text" onclick="WdatePicker()">
                        </div></td>					
					  </tr>
					  <tr>
					     <th class="table_th1"><span>上传活动图片：</span></th>
						 <td><div class="panel_content">
                             <input type="file" class="in_h" size="40"  onpaste="return false;" onkeydown="return false;">
							 <span class="remark_g">请上传一张图片图片！</span>
                        </div></td>					
					  </tr>
					  <tr>
					     <th class="table_th1"><span>活动内容：</span></th>
						 <td>
						    <div class="news_editor">
								<textarea style="width: 100%;height: 100%"></textarea>
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
</body>
<script type="text/javascript" src="../js/jquery-1.4.4.js"></script>
<script type="text/javascript" src="../datepicker/WdatePicker.js"></script>

</html>
