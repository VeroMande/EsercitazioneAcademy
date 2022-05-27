# EsercitazioneAcademy
esercitazione

# Front end
Versione Angular CLI: 13.3.3
Versione node.js: 8.5.5
Prima di tutto è necessario scaricare i pacchetti tramite il comando npm install, per avviare l’applicazione in Angular utilizzare il comando ng serve e impostare dal file environment.ts la porta 8080 per creare connessione con db. L’applicativo ha una navbar dove è possibile inserire un nuovo promemoria o vedere la lista dei promemoria (che non sono riuscita a recuperare dal datase).

# BackEnd
Il framework utilizzato è SpringBoot e il database è postgres. Ho implementato le operazioni CRUD. Purtroppo non sono riuscita a risolvere un problema: quando provo a fare le richieste con postman mi da errore 404 not found, quindi di conseguenza non sono riuscita a creare una connessione con il frontend. 
Comandi di creazione tabella database:
CREATE TABLE promemoria (
        id NOT NULL ,
        testo NOT NULL,
        dataScadenza NOT NULL,
        dataCreazione NOT NULL,
        stato NOT NULL,
        PRIMARY KEY(id)
)

Comandi inserimento dati nella tabella:
INSERT INTO "promemoria"  (id, testo , data_scadenza , data_creazione , stato)
VALUES ('3', ' leggere un libro, '2022-15-12', '2022-15-12', 'DONE');

