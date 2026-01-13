CREATE TABLE 'merchants' (
    `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
    `name` varchar(64) COLLATE utf8_bin NOT NULL COMMENT 'merchant name',
    `log_url` varchar(256) COLLATE utf8_bin NOT NULL COMMENT 'Merchant logo'
    `business_license_url` varchar(256) COLLATE utf8_bin NOT NULL COMMENT 'merchant license'
    `phone` varchar(64) COLLATE utf8_bin NOT NULL COMMENT 'merchant phone'
    `is_audit` BOOLEAN NOT NULL COMMENT 'if pass audit'
    PRIMARY KEY(`id`)

)ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARACTER=utf8;