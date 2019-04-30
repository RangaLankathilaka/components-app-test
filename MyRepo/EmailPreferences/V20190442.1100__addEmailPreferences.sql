-- Some of the table names already exist in db from previous package work implementation
DROP TABLE IF EXISTS `EmailPreferences`;

CREATE TABLE `EmailPreferences` (
 `urn` VARCHAR(225) NOT NULL COMMENT 'unique reference number ',
 `promotion` TINYINT(0) NOT NULL COMMENT 'promotions enabled true or false',
 `newsletter` TINYINT(0) NOT NULL COMMENT 'monthly newsletter true or false ',
 `unsubcribeAll` TINYINT(0) NOT NULL COMMENT 'unsubscribe all true or false',
 `phoneNumber` VARCHAR(225) NOT NULL COMMENT 'phone number',
 `confirmation` TINYINT(0) NOT NULL COMMENT 'required to send booking confirmation true or false',
 `accountId` VARCHAR(225) NOT NULL,
 PRIMARY KEY (`urn`));



