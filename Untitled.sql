CREATE TABLE `users` (
  `id` uuid PRIMARY KEY,
  `class_id` uuid,
  `name` string
);

CREATE TABLE `organizations` (
  `id` uuid PRIMARY KEY,
  `parent_id` uuid,
  `org_type` ENUM ('SCHOOL', 'CLASS'),
  `head_of_org` uuid COMMENT 'GV chu nhiem/Hieu truong',
  `name` string
);

CREATE TABLE `subjects` (
  `id` uuid PRIMARY KEY,
  `teacher_id` uuid,
  `organization_id` uuid,
  `name` string
);

CREATE TABLE `user_subjects` (
  `id` uuid PRIMARY KEY,
  `user_id` uuid,
  `subject_id` uuid,
  `score` number
);

ALTER TABLE `users` ADD FOREIGN KEY (`class_id`) REFERENCES `organizations` (`id`);

ALTER TABLE `organizations` ADD FOREIGN KEY (`parent_id`) REFERENCES `organizations` (`id`);

ALTER TABLE `organizations` ADD FOREIGN KEY (`head_of_org`) REFERENCES `users` (`id`);

ALTER TABLE `subjects` ADD FOREIGN KEY (`teacher_id`) REFERENCES `users` (`id`);

ALTER TABLE `subjects` ADD FOREIGN KEY (`organization_id`) REFERENCES `organizations` (`id`);

ALTER TABLE `user_subjects` ADD FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

ALTER TABLE `user_subjects` ADD FOREIGN KEY (`subject_id`) REFERENCES `subjects` (`id`);
