-- Project Name : IKITUKE
-- Date/Time    : 2014/12/07 14:53:09
-- Author       : fores2014
-- RDBMS Type   : MySQL
-- Application  : A5:SQL Mk-2

-- 店舗情報
drop table if exists shop_info cascade;

create table shop_info (
  shop_id INT not null comment '店舗ＩＤ	 連番で作成'
  , category_id INT not null comment '店舗カテゴリＩＤ'
  , shop_name VARCHAR(16) comment '店舗名'
  , shop_tel VARCHAR(11) comment '電話番号	 11桁'
  , shop_memo VARCHAR(2000) comment '備考	 全角1000文字まで許容'
  , shop_url VARCHAR(2048) comment '参照URL'
  , delete_flag CHAR(1) default 0 not null comment '削除フラグ	 デフォルト値は0'
  , update_time DATE not null comment '更新日付	 yyyymmddhhmm'
  , constraint shop_info_PKC primary key (shop_id)
) comment '店舗情報' ;

-- 店舗カテゴリ情報
drop table if exists shop_category cascade;

create table shop_category (
  category_id INT not null comment '店舗カテゴリＩＤ	 ログインユーザ作成時に連番で８レコード作成'
  , category_name VARCHAR(20) comment '店舗カテゴリ名	 全額10文字'
  , user_id INT not null comment 'ユーザＩＤ'
  , disable_flag CHAR(1) default 1 not null comment '無効フラグ	 デフォルト値は1'
  , update_time DATE not null comment '更新日付	 yyyymmddhhmm'
  , constraint shop_category_PKC primary key (category_id)
) comment '店舗カテゴリ情報' ;

-- ログイン情報
drop table if exists login cascade;

create table login (
  user_id INT not null comment 'ユーザＩＤ'
  , mail_address VARCHAR(64) not null comment 'メールアドレス	 半角のみ許容'
  , login_password VARCHAR(20) not null comment 'ログインパスワード	 半角英数字のみ許容'
  , create_date_time DATE not null comment '登録日付	 yyyymmddhhmm'
  , update_time DATE not null comment '更新日付	 yyyymmddhhmm'
  , constraint login_PKC primary key (user_id)
) comment 'ログイン情報' ;
