
Steps Progetto :
1) Creo il mio progetto con la libreia SpringBoot (una volta impostati i parametri finalizzo la crezione con il tasto GENERATE) 
2) Trascino il file zippato sul Desktop e lo estraggo
3) Apro Eclipse ed importo il mio progetto (File --> file Import --> Maven  --> Existing Maven Project --> Next
4) seleziono con il Browse la mia cartella ( nome che gli ho assegnato in SpringBoot ) --> importa un file .pom --> Finish
5) Avvio la macchina posizionandomi sul file che si trova sotto la cartella Main/Java. IL RUN SI FA' UNA VOLTA SOLA !... altrimenti dovrò riavviare PC
6) in Main/resources avrò: nella cartella Templates i file .html - creo per prima la pagina "index" - copio lo Starter Template da ll'Introduction di BootStrap5 - , 
   nella cartella Static i file .css  
7) Verifico che il programma funzioni visualizzandolo su FireFox  digitando 127.0.0.1 : 8080 (oppure localhost:8080 )  
8) Seleziono il mio package Main e creo un sotto package che nomino con lo stesso nome aggiungendo la dicitura controller --> Finish
9) All'interno del pakage controller creo la classe Controller ( che va finalizzato con  @Controller )  
10) All'interno della classe Controller preparo le rotte con il @GetMapping , collego i dati con //Fetch data e mand il dato alla pagina html con addObject
11) All'interno della mia cartella Main/java del progetto creo il package che nomino con lo stesso nome aggiungendo la dicitura model e 
    all'interno creo la mia classe ( nell'esempio sarà Fox ) 
11) verifico il programma in FireFox ed il progetto ...ora funziona : )
