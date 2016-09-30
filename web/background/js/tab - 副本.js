$(document).ready(function(){

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