$(document).ready(function(){
/*提示信息*/
$(".list li").click(function(){
  $(".list li").removeClass("current");
  $(this).addClass("current");
  $(".panel_con").hide().eq($(this).index()).fadeIn("1000");
});

/*tab菜单*/
$(".tablist li").click(function(){
  $(".tablist li").removeClass("current");
  $(this).addClass("current");
  $(this).parent().next(".panel_cont").find(".t").hide().eq($(this).index()).fadeIn("1000");
});
$(".panellist li").click(function(){
  if($(this).hasClass("select02")){
    $(this).removeClass("select02").addClass("select01");
    $(this).siblings().removeClass("select01").addClass("select02");
    $(".t1").hide().eq($(this).index()).fadeIn("1000");
  }
});



$(".panel_title li").click(function(){
  $(".panel_title li").removeClass("current");
  $(this).addClass("current");
  $(this).parent().next(".panel_box").find(".panel_content").hide().eq($(this).index()).fadeIn("1000");
});

/* 左侧菜单 */
$('.list_item').click(function(){
  if($(this).hasClass('list_current')){
    $(this).removeClass('list_current').parent().children('ul').removeClass('fn-hide').slideUp("1500");
  }
  else{
    $(this).addClass('list_current').parent().children('ul').slideDown("1500");
    $(this).parent().siblings('li').find('a').removeClass('list_current').siblings('ul').slideUp("1500");
  }
});

});