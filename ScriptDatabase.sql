USE palestra;

drop TABLE IF EXISTS ISCRITTO;
drop TABLE IF EXISTS MACCHINARIO;


CREATE TABLE ISCRITTO
        ( CF CHAR(50),
          NOME CHAR(40),
          COGNOME CHAR(40),
          DATADINASCITA CHAR(40));
          
CREATE TABLE MACCHINARIO
		( NOME CHAR(40),
        DATAACQUISTO CHAR(40));
          