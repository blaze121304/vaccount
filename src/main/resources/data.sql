create table VACCOUNT_MODIFY_HISTORY(
                            mchtTrdNo varchar(255),
                            mchtId varchar(255),
                            ver varchar(255),
                            method varchar(255),
                            bizType varchar(255),
                            encCd varchar(255),
                            trdDt varchar(255),
                            trdTm varchar(255),
                            mobileYn varchar(255),
                            osType varchar(255),
                            pktHash varchar(255),
                            bankCd varchar(255),
                            vAcntNo varchar(255),
                            expireDate varchar(255),
                            trdAmt varchar(255),
                            acntType varchar(255),
                            primary key (mchtTrdNo)
)

create table VACCOUNT_MODIFY_HISTORY(
                                        mid varchar(255),
                                        tid varchar(255),
                                        ver varchar(255),
                                        primary key (mid)
)