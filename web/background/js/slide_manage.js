    var addStr='<div class="con_list"><table class="dialog"><tbody>' +
            '<tr><th>【幻灯片】</th></tr>' +
            '<tr><th>表述名称：</th><td><input type="text"  size="30" maxlength="20"/><span class="remark_g">请输入图片描述的名称！</span></td></tr>' +
            '<tr><th>上传图片：</th><td><input type="file" class="in_h" size="33"  onpaste="return false;" onkeydown="return false;"><span class="remark_g">请上传一张图片图片！</span></td></tr>' +
            '<tr><th>链接地址：</th><td><input type="text" class="l_text" size="20" maxlength="300"/><span class="remark_g">请输入链接地址！</span></td></tr></tbody></table>' +
            '<div class="con_lr"><span class="details_span" ><img class="details_img" title="删除当前信息"  src="images/ico_del.gif"  /></span><a href="#" class="lr_a"><img src="images/temp/aifukang.png" alt="" /></a></div>' +
            '<div class="upbtn"><input type="button" value="提交" class="btn_sty" /><input type="button" value="取消" class="btn_sty" /></div></div>';
    /*新增幻灯片*/
    $('.add_dialog').click(function(){
        $('.detailscon').append(addStr);
        deleteForm();
        return false;
    });
	/*页面输出时有表单，取消下面的注释*/
	//deleteForm();
    /*删除表单*/
    function deleteForm(){
        $('.details_img').click(function(){
            $(this).parents('div.con_list').remove();
        });
    }