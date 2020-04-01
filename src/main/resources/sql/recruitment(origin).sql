-- DROP TABLE IF EXISTS ``;
-- CREATE TABLE `` (
--   `Id` int(10) NOT NULL AUTO_INCREMENT COMMENT '',
--   `` varchar(20) NOT NULL COMMENT '',
--   `` varchar(20) NOT NULL COMMENT '',
--   `` varchar(20) NOT NULL COMMENT '',
--   `` varchar(20) NOT NULL COMMENT '',
--   PRIMARY KEY (`Id`),
--   CONSTRAINT `` FOREIGN KEY (``) REFERENCES `` (``) ON DELETE CASCADE ON UPDATE CASCADE
-- ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='';


-- DROP TABLE IF EXISTS `recruitmentTest`;
-- CREATE TABLE `recruitmentTest` (
--   `Id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户id',
--   `name` varchar(20) NOT NULL UNIQUE COMMENT '用户名称',
--   `gender` enum('男','女') NOT NULL DEFAULT '男',
--   `gender_num` enum('1','2') NOT NULL DEFAULT '1',
--   PRIMARY KEY (`Id`)
-- ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用户数据表';

-- DROP TABLE IF EXISTS `table2`;
-- CREATE TABLE `table2` (
--   `Id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
--   `recruitmentTestId` int(10) UNIQUE,
--   PRIMARY KEY (`Id`),
--   CONSTRAINT `fk_1` FOREIGN KEY (`recruitmentTestId`) REFERENCES `recruitmentTest` (`Id`) ON DELETE CASCADE ON UPDATE CASCADE
-- ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='表2';

DROP TABLE IF EXISTS `User`;
CREATE TABLE `User` (
  `userId` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户主键',
  `email` varchar(30) NOT NULL UNIQUE COMMENT '登陆邮箱',
  `password` varchar(255) NOT NULL COMMENT '登陆密码',
  `role` enum('company','person','admin') NOT NULL DEFAULT 'person' COMMENT '用户角色',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用户';

DROP TABLE IF EXISTS `Person`;
CREATE TABLE `Person` (
  `personId` int(10) NOT NULL AUTO_INCREMENT COMMENT '个人用户主键',
  `userId` int(10) UNIQUE COMMENT '个人用户外键',
  PRIMARY KEY (`personId`),
  CONSTRAINT `person_fk_1` FOREIGN KEY (`userId`) REFERENCES `User` (`userId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='个人用户';

DROP TABLE IF EXISTS `Company`;
CREATE TABLE `Company` (
  `companyId` int(10) NOT NULL AUTO_INCREMENT COMMENT '公司用户主键',
  `userId` int(10) UNIQUE COMMENT '公司用户外键',
  `intro` text DEFAULT NULL COMMENT '',
  PRIMARY KEY (`companyId`),
  CONSTRAINT `company_fk_1` FOREIGN KEY (`userId`) REFERENCES `User` (`userId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='公司用户';

DROP TABLE IF EXISTS `OSSFile`;
CREATE TABLE `OSSFile` (
  `ossId` int(10) NOT NULL AUTO_INCREMENT COMMENT 'oss文件主键',
  `fileSize` bigint DEFAULT NULL COMMENT 'oss文件大小',
  `fileUrl` varchar(255) DEFAULT NULL UNIQUE COMMENT 'oss文件访问路径',
  `suffix` varchar(20) DEFAULT NULL COMMENT 'oss文件后缀',
  `bucket` varchar(20) DEFAULT NULL COMMENT 'oss文件篮子',
  `filename` text DEFAULT NULL COMMENT 'oss文件原名',
  PRIMARY KEY (`ossId`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='oss文件';

DROP TABLE IF EXISTS `Resume`;
CREATE TABLE `Resume` (
  `resumeId` int(10) NOT NULL AUTO_INCREMENT COMMENT '简历主键',
  `personId` int(10) UNIQUE COMMENT '个人用户id',
  `resumeName` varchar(20) DEFAULT NULL COMMENT '简历名称',
  `selfDescription` text DEFAULT NULL COMMENT '个人用户自我介绍',
  PRIMARY KEY (`resumeId`),
  CONSTRAINT `resume_fk_1` FOREIGN KEY (`personId`) REFERENCES `Person` (`personId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='简历';

DROP TABLE IF EXISTS `PersonDetail`;
CREATE TABLE `PersonDetail` (
  `personDetailId` int(10) NOT NULL AUTO_INCREMENT COMMENT '个人基本信息主键',
  `personId` int(10) UNIQUE COMMENT '个人用户id',
  `resumeId` int(10) UNIQUE COMMENT '简历id',
  `userName` varchar(20) DEFAULT NULL COMMENT '个人用户名称',
  `tel` char(11) DEFAULT NULL UNIQUE COMMENT '电话',
  `email` varchar(30) DEFAULT NULL UNIQUE COMMENT '邮箱',
  `gender` enum('男','女') DEFAULT '男' COMMENT '性别',
  `degree` varchar(20) DEFAULT NULL COMMENT '最高学历',
  `workYear` varchar(20) DEFAULT NULL COMMENT '工作经验',
  `currentState` varchar(20) DEFAULT NULL COMMENT '目前状态',
  PRIMARY KEY (`personDetailId`),
  CONSTRAINT `personDetail_fk_1` FOREIGN KEY (`personId`) REFERENCES `Person` (`personId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `personDetail_fk_2` FOREIGN KEY (`resumeId`) REFERENCES `Resume` (`resumeId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='个人基本信息';

DROP TABLE IF EXISTS `ExpectJob`;
CREATE TABLE `ExpectJob` (
  `expectJobId` int(10) NOT NULL AUTO_INCREMENT COMMENT '期望工作主键',
  `resumeId` int(10) UNIQUE COMMENT '简历id',
  `city` varchar(20) DEFAULT NULL COMMENT '期望工作城市',
  `type` enum('全职','兼职','实习') DEFAULT '全职' COMMENT '工作类型',
  `post` varchar(20) DEFAULT NULL COMMENT '职位名称',
  `salary` varchar(20) DEFAULT NULL COMMENT '工资',
  PRIMARY KEY (`expectJobId`),
  CONSTRAINT `expectJob_fk_1` FOREIGN KEY (`resumeId`) REFERENCES `Resume` (`resumeId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='期望工作';

DROP TABLE IF EXISTS `WorkExperience`;
CREATE TABLE `WorkExperience` (
  `workExperienceId` int(10) NOT NULL AUTO_INCREMENT COMMENT '工作经验主键',
  `resumeId` int(10) COMMENT '简历id',
  `comName` varchar(20) DEFAULT NULL COMMENT '公司名称',
  `post` varchar(20) DEFAULT NULL COMMENT '工作岗位',
  `startYm` varchar(20) DEFAULT NULL COMMENT '开始年月',
  `endYm` varchar(20) DEFAULT NULL COMMENT '结束年月',
  PRIMARY KEY (`workExperienceId`),
  CONSTRAINT `workExperience_fk_1` FOREIGN KEY (`resumeId`) REFERENCES `Resume` (`resumeId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='工作经验';

DROP TABLE IF EXISTS `ProjectExperience`;
CREATE TABLE `ProjectExperience` (
  `projectExperienceId` int(10) NOT NULL AUTO_INCREMENT COMMENT '项目经验主键',
  `resumeId` int(10) COMMENT '简历id',
  `proName` varchar(20) DEFAULT NULL COMMENT '项目名称',
  `post` varchar(20) DEFAULT NULL COMMENT '担任职位',
  `startYm` varchar(20) DEFAULT NULL COMMENT '开始年月',
  `endYm` varchar(20) DEFAULT NULL COMMENT '结束年月',
  `intro` text DEFAULT NULL COMMENT '项目介绍',
  PRIMARY KEY (`projectExperienceId`),
  CONSTRAINT `projectExperience_fk_1` FOREIGN KEY (`resumeId`) REFERENCES `Resume` (`resumeId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='项目经验';

DROP TABLE IF EXISTS `Education`;
CREATE TABLE `Education` (
  `educationId` int(10) NOT NULL AUTO_INCREMENT COMMENT '教育背景主键',
  `resumeId` int(10) COMMENT '简历id',
  `schoole` varchar(20) DEFAULT NULL COMMENT '学校',
  `degree` varchar(20) DEFAULT NULL COMMENT '学历',
  `profession` varchar(20) DEFAULT NULL COMMENT '专业',
  `startYear` varchar(20) DEFAULT NULL COMMENT '开始年份',
  `endYear` varchar(20) DEFAULT NULL COMMENT '结束年份',
  `rank` varchar(20) DEFAULT NULL COMMENT '成绩排名',
  PRIMARY KEY (`educationId`),
  CONSTRAINT `education_fk_1` FOREIGN KEY (`resumeId`) REFERENCES `Resume` (`resumeId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='教育背景';

DROP TABLE IF EXISTS `AttachmentResume`;
CREATE TABLE `AttachmentResume` (
  `attachmentResumeId` int(10) NOT NULL AUTO_INCREMENT COMMENT '简历附件主键',
  `personId` int(10) COMMENT '个人用户id',
  `ossId` int(10) UNIQUE COMMENT 'oss文件id',
  `name` text DEFAULT NULL COMMENT '文件原名',
  PRIMARY KEY (`attachmentResumeId`),
  CONSTRAINT `attachmentResume_fk_1` FOREIGN KEY (`personId`) REFERENCES `Person` (`personId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `attachmentResume_fk_2` FOREIGN KEY (`ossId`) REFERENCES `OSSFile` (`ossId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='简历附件';

DROP TABLE IF EXISTS `DefaultResume`;
CREATE TABLE `DefaultResume` (
  `defaultResumeId` int(10) NOT NULL AUTO_INCREMENT COMMENT '默认简历主键',
  `personId` int(10) UNIQUE COMMENT '个人用户id',
  `resumeId` int(10) UNIQUE COMMENT '简历id',
  `attachmentResumeId` int(10) UNIQUE COMMENT '简历附件id',
  PRIMARY KEY (`defaultResumeId`),
  CONSTRAINT `defaultResume_fk_1` FOREIGN KEY (`personId`) REFERENCES `Person` (`personId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `defaultResume_fk_2` FOREIGN KEY (`resumeId`) REFERENCES `Resume` (`resumeId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `defaultResume_fk_3` FOREIGN KEY (`attachmentResumeId`) REFERENCES `AttachmentResume` (`attachmentResumeId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='默认简历';

DROP TABLE IF EXISTS `PersonImg`;
CREATE TABLE `PersonImg` (
  `personImgId` int(10) NOT NULL AUTO_INCREMENT COMMENT '个人照片主键',
  `personDetailId` int(10) UNIQUE COMMENT '个人基本信息id',
  `ossId` int(10) UNIQUE COMMENT 'oss文件id',
  PRIMARY KEY (`personImgId`),
  CONSTRAINT `personImg_fk_1` FOREIGN KEY (`personDetailId`) REFERENCES `PersonDetail` (`personDetailId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `personImg_fk_2` FOREIGN KEY (`ossId`) REFERENCES `OSSFile` (`ossId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='个人照片';

DROP TABLE IF EXISTS `CompanyReport`;
CREATE TABLE `CompanyReport` (
  `companyReportId` int(10) NOT NULL AUTO_INCREMENT COMMENT '公司报道主键',
  `companyId` int(10) COMMENT '公司用户id',
  `repotitle` varchar(20) DEFAULT NULL COMMENT '公司报道标题',
  `repolink` text DEFAULT NULL COMMENT '公司报道链接',
  PRIMARY KEY (`companyReportId`),
  CONSTRAINT `companyReport_fk_1` FOREIGN KEY (`companyId`) REFERENCES `Company` (`companyId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='公司报道';

DROP TABLE IF EXISTS `CompanyStage`;
CREATE TABLE `CompanyStage` (
  `companyStageId` int(10) NOT NULL AUTO_INCREMENT COMMENT '融资情况主键',
  `companyId` int(10) UNIQUE COMMENT '公司用户id',
  `currentStage` varchar(20) DEFAULT NULL COMMENT '目前融资阶段',
  `org` varchar(20) DEFAULT NULL COMMENT '投资机构',
  PRIMARY KEY (`companyStageId`),
  CONSTRAINT `companyStage_fk_1` FOREIGN KEY (`companyId`) REFERENCES `Company` (`companyId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='融资情况';

DROP TABLE IF EXISTS `CompanyMember`;
CREATE TABLE `CompanyMember` (
  `companyMemberId` int(10) NOT NULL AUTO_INCREMENT COMMENT '公司负责人主键',
  `companyId` int(10) UNIQUE COMMENT '公司用户id',
  `name` varchar(20) DEFAULT NULL COMMENT '公司负责人姓名',
  `post` varchar(20) DEFAULT NULL COMMENT '公司负责人职位',
  `intro` text DEFAULT NULL COMMENT '公司负责人介绍',
  PRIMARY KEY (`companyMemberId`),
  CONSTRAINT `companyMember_fk_1` FOREIGN KEY (`companyId`) REFERENCES `Company` (`companyId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='公司负责人';

DROP TABLE IF EXISTS `MemberImg`;
CREATE TABLE `MemberImg` (
  `memberImgId` int(10) NOT NULL AUTO_INCREMENT COMMENT '公司负责人照片主键',
  `companyMemberId` int(10) UNIQUE COMMENT '公司负责人id',
  `ossId` int(10) UNIQUE COMMENT 'oss文件id',
  PRIMARY KEY (`memberImgId`),
  CONSTRAINT `memberImg_fk_1` FOREIGN KEY (`companyMemberId`) REFERENCES `CompanyMember` (`companyMemberId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `memberImg_fk_2` FOREIGN KEY (`ossId`) REFERENCES `OSSFile` (`ossId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='公司负责人照片';

DROP TABLE IF EXISTS `CompanyDetail`;
CREATE TABLE `CompanyDetail` (
  `companyDetailId` int(10) NOT NULL AUTO_INCREMENT COMMENT '公司基本信息主键',
  `companyId` int(10) UNIQUE COMMENT '公司用户id',
  `fullName` varchar(20) DEFAULT NULL UNIQUE COMMENT '公司全称',
  `shortName` varchar(20) DEFAULT NULL UNIQUE COMMENT '公司简称',
  `feature` text DEFAULT NULL COMMENT '一句话描述',
  `city` varchar(20) DEFAULT NULL COMMENT '所在城市',
  `field` varchar(20) DEFAULT NULL COMMENT '所在领域',
  `scale` varchar(20) DEFAULT NULL COMMENT '公司规模',
  `comurl` text DEFAULT NULL COMMENT '公司官网',
  PRIMARY KEY (`companyDetailId`),
  CONSTRAINT `companyDetail_fk_1` FOREIGN KEY (`companyId`) REFERENCES `Company` (`companyId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='公司基本信息';

DROP TABLE IF EXISTS `CompanyLabel`;
CREATE TABLE `CompanyLabel` (
  `companyLabelId` int(10) NOT NULL AUTO_INCREMENT COMMENT '公司标签主键',
  `companyDetailId` int(10) COMMENT '公司基本信息id',
  `label` varchar(20) DEFAULT NULL COMMENT '公司标签内容',
  PRIMARY KEY (`companyLabelId`),
  CONSTRAINT `companyLabel_fk_1` FOREIGN KEY (`companyDetailId`) REFERENCES `CompanyDetail` (`companyDetailId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='公司标签';

DROP TABLE IF EXISTS `CompanyImg`;
CREATE TABLE `CompanyImg` (
  `companyImgId` int(10) NOT NULL AUTO_INCREMENT COMMENT '公司图标主键',
  `companyDetailId` int(10) UNIQUE COMMENT '公司基本信息id',
  `ossId` int(10) UNIQUE COMMENT 'oss文件id',
  PRIMARY KEY (`companyImgId`),
  CONSTRAINT `companyImg_fk_1` FOREIGN KEY (`companyDetailId`) REFERENCES `CompanyDetail` (`companyDetailId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `companyImg_fk_2` FOREIGN KEY (`ossId`) REFERENCES `OSSFile` (`ossId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='公司图标';

DROP TABLE IF EXISTS `CompanyProduct`;
CREATE TABLE `CompanyProduct` (
  `companyProductId` int(10) NOT NULL AUTO_INCREMENT COMMENT '公司产品主键',
  `companyId` int(10) COMMENT '公司用户id',
  `name` varchar(20) DEFAULT NULL COMMENT '产品名称',
  `info` text DEFAULT NULL COMMENT '产品信息',
  PRIMARY KEY (`companyProductId`),
  CONSTRAINT `companyProduct_fk_1` FOREIGN KEY (`companyId`) REFERENCES `Company` (`companyId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='公司产品';

DROP TABLE IF EXISTS `ProductImg`;
CREATE TABLE `ProductImg` (
  `productImgId` int(10) NOT NULL AUTO_INCREMENT COMMENT '产品图片主键',
  `companyProductId` int(10) UNIQUE COMMENT '公司产品id',
  `ossId` int(10) UNIQUE COMMENT 'oss文件id',
  PRIMARY KEY (`productImgId`),
  CONSTRAINT `productImg_fk_1` FOREIGN KEY (`companyProductId`) REFERENCES `CompanyProduct` (`companyProductId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `productImg_fk_2` FOREIGN KEY (`ossId`) REFERENCES `OSSFile` (`ossId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='产品图片';

DROP TABLE IF EXISTS `Position`;
CREATE TABLE `Position` (
  `positionId` int(10) NOT NULL AUTO_INCREMENT COMMENT '职位主键',
  `companyId` int(10) COMMENT '公司用户id',
  `post` varchar(20) DEFAULT NULL COMMENT '职位类别',
  `name` varchar(20) DEFAULT NULL COMMENT '职位名称',
  `type` enum('全职','兼职','实习') DEFAULT '全职' COMMENT '职位类型',
  `department` varchar(20) DEFAULT NULL COMMENT '职位部门',
  `salaryMin` int DEFAULT NULL COMMENT '职位最低工资',
  `salaryMax` int DEFAULT NULL COMMENT '职位最高工资',
  `city` varchar(20) DEFAULT NULL COMMENT '职位所在城市',
  `experience` varchar(20) DEFAULT NULL COMMENT '职位要求经验',
  `degree` varchar(20) DEFAULT NULL COMMENT '职位要求学历',
  `advantage` text DEFAULT NULL COMMENT '职位诱惑',
  `detail` text DEFAULT NULL COMMENT '职位描述',
  `address` text DEFAULT NULL COMMENT '职位所在具体地址',
  `status` char(1) DEFAULT '1' COMMENT '职位上下线状态,’0’为下线,’1’上线',
  `releaseTime` varchar(20) DEFAULT NULL COMMENT'职位发布时间',
  PRIMARY KEY (`positionId`),
  CONSTRAINT `position_fk_1` FOREIGN KEY (`companyId`) REFERENCES `Company` (`companyId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='职位';

DROP TABLE IF EXISTS `Delivery`;
CREATE TABLE `Delivery` (
  `deliveryId` int(10) NOT NULL AUTO_INCREMENT COMMENT '投递记录主键',
  `positionId` int(10) COMMENT '职位id',
  `personId` int(10) COMMENT '个人用户id',
  `deliveryTime` varchar(20) DEFAULT NULL COMMENT '投递时间',
  `status` int DEFAULT 1 COMMENT '投递状态',
  PRIMARY KEY (`deliveryId`),
  CONSTRAINT `delivery_fk_1` FOREIGN KEY (`positionId`) REFERENCES `Position` (`positionId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `delivery_fk_2` FOREIGN KEY (`personId`) REFERENCES `Person` (`personId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='投递记录';

DROP TABLE IF EXISTS `FeedBack`;
CREATE TABLE `FeedBack` (
  `feedBackId` int(10) NOT NULL AUTO_INCREMENT COMMENT '反馈主键',
  `deliveryId` int(10) UNIQUE COMMENT '投递记录id',
  `feedBackTime` varchar(20) DEFAULT NULL COMMENT '反馈时间',
  `feedback` enum('不合适','邀请面试') DEFAULT '不合适' COMMENT '反馈结果',
  PRIMARY KEY (`feedBackId`),
  CONSTRAINT `feedBack_fk_1` FOREIGN KEY (`deliveryId`) REFERENCES `Delivery` (`deliveryId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='反馈';

DROP TABLE IF EXISTS `FeedBackDetail`;
CREATE TABLE `FeedBackDetail` (
  `feedBackDetailId` int(10) NOT NULL AUTO_INCREMENT COMMENT '反馈细节主键',
  `feedBackId` int(10) UNIQUE COMMENT '反馈id',
  `address` text DEFAULT NULL COMMENT '面试地点',
  `time` varchar(20) DEFAULT NULL COMMENT '面试时间',
  `tel` char(11) DEFAULT NULL COMMENT 'HR联系方式',
  PRIMARY KEY (`feedBackDetailId`),
  CONSTRAINT `feedBackDetail_fk_1` FOREIGN KEY (`feedBackId`) REFERENCES `FeedBack` (`feedBackId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='反馈细节';
