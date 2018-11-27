CREATE TABLE blog.post_profile
(
    id int(10) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    title varchar(64) NOT NULL,
    description varchar(512) NOT NULL,
    tag varchar(64) NOT NULL,
    create_time datetime NOT NULL,
    modify_time datetime NOT NULL,
    is_top tinyint(1) NOT NULL
);
INSERT INTO blog.post_profile (id, title, description, tag, create_time, modify_time, is_top) VALUES (1, 'Mininet Documents In Chinese - Walkthrough', '本指南给出了大部分 Mininet 命令的使用方法，以及一些和 Wireshark 一起使用的典型例子。', 'Mininet, Document, Walkthrough', '2018-09-29 07:50:32', '2018-09-29 07:50:34', 0);
INSERT INTO blog.post_profile (id, title, description, tag, create_time, modify_time, is_top) VALUES (2, 'Mininet Documents In Chinese - Sample Workflow', 'Mininet 的示例工作流', 'Mininet, Document, Sample Walkflow', '2018-09-29 07:52:40', '2018-09-29 07:52:43', 1);
INSERT INTO blog.post_profile (id, title, description, tag, create_time, modify_time, is_top) VALUES (3, 'Mininet Documents In Chinese - Get Start', 'Mininet 起步简介', 'Mininet, Document, Get Start', '2018-09-29 07:54:42', '2018-09-29 07:54:44', 0);