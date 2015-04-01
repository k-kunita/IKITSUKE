$(function() {
    var d = $('#dialog');

  // 1ダイアログを初期化（自動オープンしない）
  d.dialog({
    modal: false,
    autoOpen: false
  });

  // ボタン・クリック時にダイアログを開く
  $('#btn').click(function(e){
    d.dialog('open');
  });
});
