SELECT CHAT_NO, READ_OR_NOT, CHAT_MESSAGE, CHAT_SEND_DT, CHATROOM_NO, USER_NO
FROM CHAT;

SELECT CHATROOM_NO, CREATE_DT, PRODUCT_NO, USER_NO
FROM CHATROOM;

DELETE FROM CHATTING_ROOM
WHERE CHATTING_NO=;

SELECT MESSAGE_NO, MESSAGE_CONTENT, READ_FL, SEND_TIME, SENDER_NO, CHATTING_NO
FROM MESSAGE
ORDER BY 1 DESC;


-- 채팅
CREATE TABLE "CHATTING_ROOM" (
	"CHATTING_NO"	NUMBER		NOT NULL,
	"CH_CREATE_DATE"	DATE	DEFAULT SYSDATE	NOT NULL,
	"OPEN_MEMBER"	NUMBER		NOT NULL,
	"PARTICIPANT"	NUMBER		NOT NULL
);
COMMENT ON COLUMN "CHATTING_ROOM"."CHATTING_NO" IS '채팅방 번호';
COMMENT ON COLUMN "CHATTING_ROOM"."CH_CREATE_DATE" IS '채팅방 생성일';
COMMENT ON COLUMN "CHATTING_ROOM"."OPEN_MEMBER" IS '개설자 회원 번호';
COMMENT ON COLUMN "CHATTING_ROOM"."PARTICIPANT" IS '참여자 회원 번호';
ALTER TABLE "CHATTING_ROOM" ADD CONSTRAINT "PK_CHATTING_ROOM" PRIMARY KEY (
	"CHATTING_NO"
);
SELECT CHATTING_NO, CH_CREATE_DATE, OPEN_MEMBER, PARTICIPANT
FROM CHATTING_ROOM;

ALTER TABLE "CHATTING_ROOM"
ADD CONSTRAINT "FK_OPEN_MEMBER"
FOREIGN KEY ("OPEN_MEMBER") REFERENCES "USER";
ALTER TABLE "CHATTING_ROOM"
ADD CONSTRAINT "FK_PARTICIPANT"
FOREIGN KEY ("PARTICIPANT") REFERENCES "USER";
DROP TABLE "MESSAGE";
CREATE TABLE "MESSAGE" (
	"MESSAGE_NO"	NUMBER		NOT NULL,
	"MESSAGE_CONTENT"	VARCHAR2(4000)		NOT NULL,
	"READ_FL"	CHAR	DEFAULT 'N'	NOT NULL,
	"SEND_TIME"	DATE	DEFAULT SYSDATE	NOT NULL,
	"SENDER_NO"	NUMBER		NOT NULL,
	"CHATTING_NO"	NUMBER		NOT NULL
);
COMMENT ON COLUMN "MESSAGE"."MESSAGE_NO" IS '메세지 번호';
COMMENT ON COLUMN "MESSAGE"."MESSAGE_CONTENT" IS '메세지 내용';
COMMENT ON COLUMN "MESSAGE"."READ_FL" IS '읽음 여부';
COMMENT ON COLUMN "MESSAGE"."SEND_TIME" IS '메세지 보낸 시간';
COMMENT ON COLUMN "MESSAGE"."SENDER_NO" IS '보낸 회원의 번호';
COMMENT ON COLUMN "MESSAGE"."CHATTING_NO" IS '채팅방 번호';
ALTER TABLE "MESSAGE" ADD CONSTRAINT "PK_MESSAGE" PRIMARY KEY (
	"MESSAGE_NO"
);
ALTER TABLE "MESSAGE"
ADD CONSTRAINT "FK_CHATTING_NO"
FOREIGN KEY ("CHATTING_NO") REFERENCES "CHATTING_ROOM";
ALTER TABLE "MESSAGE"
ADD CONSTRAINT "FK_SENDER_NO"
FOREIGN KEY ("SENDER_NO") REFERENCES "USER";
-- 시퀀스 생성
CREATE SEQUENCE SEQ_ROOM_NO NOCACHE;
CREATE SEQUENCE SEQ_MESSAGE_NO NOCACHE;

SELECT USER_NO, USER_EMAIL, USER_PASSWORD, USER_NAME, USER_TEL, PROFILE_IMG, CREATE_DT, USER_TYPE, USER_STATE
FROM "USER";

DROP TABLE CHATROOM;
-----------------

DELETE FROM CHATTING_ROOM;

COMMIT;


SELECT USER_NO, USER_EMAIL, USER_NAME, PROFILE_IMG  FROM "USER"
WHERE (USER_EMAIL LIKE '%guide%' OR USER_NAME LIKE '%이%')
AND USER_STATE = 'N'
AND USER_NO != 20;




		SELECT CHATTING_NO
			,(SELECT MESSAGE_CONTENT FROM (
				SELECT * FROM MESSAGE M2
				WHERE M2.CHATTING_NO = R.CHATTING_NO
				ORDER BY MESSAGE_NO DESC) 
				WHERE ROWNUM = 1) LAST_MESSAGE
			,(SELECT TYPE FROM (
				SELECT * FROM MESSAGE M2
				WHERE M2.CHATTING_NO = R.CHATTING_NO
				ORDER BY MESSAGE_NO DESC) 
				WHERE ROWNUM = 1) TYPE
			,TO_CHAR(NVL((SELECT MAX(SEND_TIME) SEND_TIME 
					FROM MESSAGE M
					WHERE R.CHATTING_NO  = M.CHATTING_NO), CH_CREATE_DATE), 
					'YYYY.MM.DD') SEND_TIME
			,NVL2((SELECT OPEN_MEMBER FROM CHATTING_ROOM R2
				WHERE R2.CHATTING_NO = R.CHATTING_NO
				AND R2.OPEN_MEMBER = 26),
				R.PARTICIPANT,
				R.OPEN_MEMBER
				) TARGET_NO	
			,NVL2((SELECT OPEN_MEMBER FROM CHATTING_ROOM R2
				WHERE R2.CHATTING_NO = R.CHATTING_NO
				AND R2.OPEN_MEMBER = 26),
				(SELECT USER_NAME FROM "USER" WHERE USER_NO = R.PARTICIPANT),
				(SELECT USER_NAME FROM "USER" WHERE USER_NO = R.OPEN_MEMBER)
				) TARGET_NICKNAME	
			,NVL2((SELECT OPEN_MEMBER FROM CHATTING_ROOM R2
				WHERE R2.CHATTING_NO = R.CHATTING_NO
				AND R2.OPEN_MEMBER = 26),
				(SELECT PROFILE_IMG FROM "USER" WHERE USER_NO = R.PARTICIPANT),
				(SELECT PROFILE_IMG FROM "USER" WHERE USER_NO = R.OPEN_MEMBER)
				) TARGET_PROFILE
			,(SELECT COUNT(*) FROM MESSAGE M WHERE M.CHATTING_NO = R.CHATTING_NO AND READ_FL = 'N' AND SENDER_NO != 26) NOT_READ_COUNT
			,(SELECT MAX(MESSAGE_NO) SEND_TIME FROM MESSAGE M WHERE R.CHATTING_NO  = M.CHATTING_NO) MAX_MESSAGE_NO
		FROM CHATTING_ROOM R
		WHERE OPEN_MEMBER = 26
		OR PARTICIPANT = 26
		ORDER BY MAX_MESSAGE_NO DESC NULLS LAST;
		
	
	
UPDATE MESSAGE SET
TYPE = 2
WHERE MESSAGE_CONTENT LIKE '<li%';
COMMIT;

SELECT RESERVATION_NO, PRODUCT_NO, USER_NO, CREATE_DT, RESERVATION_STATE, PAYMENT_METHOD, GUEST_COUNT, PRODUCT_DT_NO, OPTION_NO, REQUEST_CONTENT, ORDER_NUMBER, TOTAL_PRICE, IMP_UID, CANCEL_REASON
FROM RESERVATION
ORDER  BY 1 DESC;

SELECT * FROM NOTIFICATION ;
