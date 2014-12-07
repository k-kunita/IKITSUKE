-- Project Name : IKITUKE
-- Date/Time    : 2014/12/07 14:53:09
-- Author       : fores2014
-- RDBMS Type   : MySQL
-- Application  : A5:SQL Mk-2

-- �X�܏��
drop table if exists shop_info cascade;

create table shop_info (
  shop_id INT not null comment '�X�܂h�c	 �A�Ԃō쐬'
  , category_id INT not null comment '�X�܃J�e�S���h�c'
  , shop_name VARCHAR(16) comment '�X�ܖ�'
  , shop_tel VARCHAR(11) comment '�d�b�ԍ�	 11��'
  , shop_memo VARCHAR(2000) comment '���l	 �S�p1000�����܂ŋ��e'
  , shop_url VARCHAR(2048) comment '�Q��URL'
  , delete_flag CHAR(1) default 0 not null comment '�폜�t���O	 �f�t�H���g�l��0'
  , update_time DATE not null comment '�X�V���t	 yyyymmddhhmm'
  , constraint shop_info_PKC primary key (shop_id)
) comment '�X�܏��' ;

-- �X�܃J�e�S�����
drop table if exists shop_category cascade;

create table shop_category (
  category_id INT not null comment '�X�܃J�e�S���h�c	 ���O�C�����[�U�쐬���ɘA�ԂłW���R�[�h�쐬'
  , category_name VARCHAR(20) comment '�X�܃J�e�S����	 �S�z10����'
  , user_id INT not null comment '���[�U�h�c'
  , disable_flag CHAR(1) default 1 not null comment '�����t���O	 �f�t�H���g�l��1'
  , update_time DATE not null comment '�X�V���t	 yyyymmddhhmm'
  , constraint shop_category_PKC primary key (category_id)
) comment '�X�܃J�e�S�����' ;

-- ���O�C�����
drop table if exists login cascade;

create table login (
  user_id INT not null comment '���[�U�h�c'
  , mail_address VARCHAR(64) not null comment '���[���A�h���X	 ���p�̂݋��e'
  , login_password VARCHAR(20) not null comment '���O�C���p�X���[�h	 ���p�p�����̂݋��e'
  , create_date_time DATE not null comment '�o�^���t	 yyyymmddhhmm'
  , update_time DATE not null comment '�X�V���t	 yyyymmddhhmm'
  , constraint login_PKC primary key (user_id)
) comment '���O�C�����' ;
