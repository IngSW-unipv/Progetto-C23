USE palestra;

drop TABLE IF EXISTS ISCRITTO;


CREATE TABLE ISCRITTO
        (  CF CHAR(40),
          NOME CHAR(40),
          COGNOME CHAR(40),
          DATADINASCITA CHAR(40),
          CODICEBADGE CHAR(40));
          