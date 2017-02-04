package com.example.michele.ersupal.model;

import android.support.v7.app.AppCompatActivity;

import com.example.michele.ersupal.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michele on 28/01/2017.
 */

public class DerpData extends AppCompatActivity {

    private static final String[] titles = {"AVVISO SCADENZA TERMINE CONFERMA STATUS FUORI SEDE",
            "AFFIDAMENTO DELL’INCARICO DI “RESPONSABILE ESTERNO DEL SERVIZIO DI PREVENZIONE E PROTEZIONE (R.S.P.P)",
            "AVVISO AGLI STUDENTI",
            "BANDO DI CONCORSO PER L’ATTRIBUZIONE DI CONTRIBUTI PER “FITTO – CASA”A.A.2016/17",
            "DISPOSIZIONI PER LA PREVENZIONE E LA REPRESSIONE" +
                    " DELLA CORRUZIONE E DELL’ILLEGALITÀ NELLA PUBBLICA AMMINISTRAZIONE - " +
                    "CONSULTAZIONE PUBBLICA BOZZA AGGIORNAMENTO PIANO TRIENNALE ANTI CORRUZIONE",
            "AVVISO AGLI STUDENTI",
            "Servizio di trasporto degli studenti con limitata autonomia motoria ospiti presso le Case",
            "LAVORI DI MANUTENZIONE STRAORDINARIA SULLE CANNE FUMARIE DELLA CASA DELLO STUDENTE DI VIA BUSINCO",
            "SERVIZIO DI PUBBLICAZIONE DELL’AVVISO DI AGGIUDICAZIONE P.A. SERVIZI DI PULIZIA",
            "SERVIZI DI PULIZIA E SERVIZI ACCESSORI DELLE RESIDENZE E UFFICI DELL'AMMINISTRAZIONE DELL’ERSU DI CA"
    };
    private static final String[] subTitles = {"Ultimo aggiornamento (Venerdì 27 Gennaio 2017 09:10)\n\n"+
            "Si ricorda agli studenti beneficiari di borsa di studio per l'A.A. 2016/17, non titolari di posto alloggio, che hanno dichiarato, ai fini dell'attribuzione dello status di fuori sede, di voler alloggiare a titolo oneroso nei pressi della sede universitaria, che il 31 gennaio 2017 scadrà il termine per la presentazione dell'autocertificazione dello status di fuori sede, prevista dall'art.18 del bando di concorso per l'assegnazione di borse di studio.\n" +
            "Il modulo di autocertificazione è disponibile presso lo Sportello per il Diritto allo Studio, Corso Vittorio Emanuele n.68, Cagliari, e può essere scaricato dal sito www.ersucagliari.it. \n" +
            "Agli studenti ai quali è stata già erogata la prima rata della borsa di studio, e che non presentano la prescritta autocertificazione entro la suddetta scadenza, sarà attribuito d'ufficio lo " +
            "status di pendolare, con la corrispondente rideterminazione del valore in denaro della seconda rata della borsa di studio e del numero dei pasti gratuiti assegnati.\n\n" +
            "Cagliari, 27 gennaio 2017\n" +
            "IL RESPONSABILE DELL'UFFICIO\n" +
            "DIRITTO ALLO STUDIO\n" +
            "Dott.ssa Maria Grazia Medda",

            "Ultimo aggiornamento (Martedì 30 Novembre 1999 01:00)\n\n"+
                    "AVVISO DI GARA\n" +
                    "Si comunica che l'ERSU di Cagliari, in esecuzione della Determinazione a contrarre del Direttore Generale n. 185 del 29/12/2016, intende procedere all'espletamento di una procedura negoziata informatizzata, ex art. 36 co. 2 lett. b) del D.lgs. 50/2016, da aggiudicarsi secondo il criterio del minor prezzo ai sensi dell’art. 95. co. 4 lett. b) del D.lgs 50/2016, per l'affidamento dell’incarico di “Responsabile esterno del Servizio di Prevenzione e Protezione (R.S.P.P.) ai sensi del D.Lgs. 9 aprile 2008 n. 81 (tutela della salute e della sicurezza nei luoghi di lavoro) e ss.mm.ii.”. Rif. App. 13BO/2017. CIG ZD11CC4156.\n" +
                    "Tale procedura sarà espletata mediante Richiesta di Offerta (R.d.O.) sul mercato elettronico regionale Sardegna CAT, con invito rivolto a tutti gli operatori economici iscritti ed abilitati nella categoria merceologica “AE27- SERVIZI SANITARI E DI SICUREZZA”.\n" +
                    "Tutta la documentazione di gara e progettuale è stata pubblicata sul portale www.sardegnacat.it.\n" +
                    "Scadenza presentazione offerte: 13/02/2017 ore 23:59.\n" +
                    "Seduta di gara pubblica: 14/02/2017 ore 09:00.\n" +
                    "IL DIRETTORE DEL SERVIZIO AMMINISTRATIVO\n" +
                    " f.to dott.ssa Angela Maria Porcu",
            "Ultimo aggiornamento (Mercoledì 25 Gennaio 2017 13:12)\n\n"+
                    "Si informa che il giorno giovedì 26 gennaio 2017 l'Ufficio Attività Culturali e la Sala lettura di via Trentino saranno chiusi al pubblico.\n" +
                    "In caso di necessità gli utenti potranno rivolgersi al Responsabile dell'Ufficio Attività Culturali al seguente recapito telefonico: 070 66201.\n\n" +
                    "Cagliari, 25 gennaio 2017\n" +
                    "\n" +
                    "IL RESPONSABILE DELL'UFFICIO\n" +
                    "ATTIVITA' CULTURALI\n" +
                    "F.to Dott.ssa Maria Grazia Medda",

            "Ultimo aggiornamento (Lunedì 23 Gennaio 2017 09:37)\n\n" +
            "Si rende noto che, con determinazione n.144/DSC del 23 dicembre 2016 del Direttore del Servizio Diritto allo Studio e Culturale, l'E.R.S.U. di Cagliari ha approvato il bando di concorso per l'assegnazione di contributi per il \"Fitto Casa\" per l'A.A.2016/17.\n" +
            "Gli interessati potranno consultare il testo integrale del bando sui siti internet dell'ERSU agli indirizzi www.ersucagliari.it e www.ersucagliarionline.it.\n" +
            "Per informazioni sul bando e sulla documentazione richiesta dovranno rivolgersi all'Ufficio Diritto allo Studio, Corso Vittorio Emanuele n.68, Cagliari, dal lunedì al venerdì dalle ore 9,30 alle ore 12,30, il martedì dalle ore 15.30 alle ore 17.30.\n" +
            "Le domande dovranno essere presentate on line sul sito internet www.ersucagliarionline.it dalle ore 9,00 del 23 gennaio 2017 ed entro le ore 13.00 del 2 marzo 2017.\n" +
            "Si invitano gli interessati a richiedere tempestivamente l'attestazione ISEE 2017, che dovrà recare la dicitura \"Si applica alle prestazioni agevolate per il diritto allo studio universitario\", necessaria per la partecipazione al suddetto bando di concorso.\n\n" +
            "Cagliari, 23.01.2017\n" +
            "IL RESPONSABILE DELL'UFFICIO\n" +
            "DIRITTO ALLO STUDIO\n" +
            "Dott.ssa Maria Grazia Medda",


            "Richiamato l'art. 1 comma 7 della Legge 6 novembre 2012 n.190 recante \"Disposizioni per la prevenzione e la repressione della corruzione e dell'illegalità nella pubblica amministrazione\", il Responsabile della prevenzione della corruzione informa che, in calce alla pagina, è in visione la bozza dell'Aggiornamento al piano triennale di prevenzione della corruzione 2017-2019.\n" +
                    "Nell'intento di favorire il più ampio e propositivo coinvolgimento in chiave di ascolto, si invitano tutti i soggetti cui il presente Avviso è rivolto, a presentare eventuali proposte e/o osservazioni entro le ore 12 del giorno 25/01/2016.\n" +
                    "Le proposte e le osservazioni, debitamente sottoscritte, dovranno pervenire mediante invio all'indirizzo di:\n" +
                    "- posta elettronica dedicata respanticorruzione.ersuca@gmail.com\n" +
                    "- posta elettronica certificata ersuca.direzionegenerale@pcert.postecert.it\n" +
                    "ovvero mediante consegna all'Ufficio Protocollo Generale, sito nel Corso Vittorio Emanuele, 68 - Cagliari\n" +
                    "utilizzando l'apposito modello allegato. In caso di invio tramite posta elettronica, specificare nell'oggetto \"Osservazioni e/o proposte all'aggiornamento del Piano triennale per la prevenzione della corruzione dell'ERSU di Cagliari 2017/2019\".\n" +
                    "F.to IL RESPONSABILE PER LA PREVENZIONE DELLA CORRUZIONE\n" +
                    "Dott.ssa Michela Mancuso" +
                    "Si informa che in occasione delle prossime festività, nei giorni dal 27 al 30 dicembre 2016 e dal 2 al 5 gennaio 2017, lo Sportello per il diritto allo studio non aprirà al pubblico, ma gli utenti potranno rivolgersi al personale in servizio presso l'Ufficio Diritto allo Studio dalle ore 9,30 alle ore 12,30 (tel. 070 66201).\n" +
                    "Nelle stesse giornate non saranno operative le postazioni di assistenza per la compilazione on line delle domande accesso al servizio mensa.\n" +
                    "\n" +
                    "Si informa inoltre che il giorno 2 gennaio e la sera del 3 gennaio 2017 l'Ufficio Attività Culturali resterà chiuso.\n" +
                    "\n" +
                    "Cagliari, 23 dicembre 2016\n" +
                    "\n" +
                    "IL RESPONSABILE DELL'UFFICIO\n" +
                    "DIRITTO ALLO STUDIO E DELL'UFFICIO ATTIVITA' CULTURALI\n" +
                    "Dott.ssa Maria Grazia Medda",
            "Ultimo aggiornamento (Venerdì 23 Dicembre 2016 10:03)\n\n" +

                    "Si informa che in occasione delle prossime festività, nei giorni dal 27 al 30 dicembre 2016 e dal 2 al 5 gennaio 2017, lo Sportello per il diritto allo studio non aprirà al pubblico, ma gli utenti potranno rivolgersi al personale in servizio presso l'Ufficio Diritto allo Studio dalle ore 9,30 alle ore 12,30 (tel. 070 66201).\n" +
                    "Nelle stesse giornate non saranno operative le postazioni di assistenza per la compilazione on line delle domande accesso al servizio mensa.\n" +
                    "\n" +
                    "Si informa inoltre che il giorno 2 gennaio e la sera del 3 gennaio 2017 l'Ufficio Attività Culturali resterà chiuso.\n" +
                    "\n" +
                    "Cagliari, 23 dicembre 2016\n" +
                    "\n" +
                    "IL RESPONSABILE DELL'UFFICIO\n" +
                    "DIRITTO ALLO STUDIO E DELL'UFFICIO ATTIVITA' CULTURALI\n" +
                    "Dott.ssa Maria Grazia Medda",


            "Ultimo aggiornamento (Martedì 30 Novembre 1999 01:00)\n\n"+
            "Servizio di trasporto degli studenti con limitata autonomia motoria ospiti presso la Casa dello Studente di via Trentino, per un periodo di sei mesi",

            "Ultimo aggiornamento (Martedì 30 Novembre 1999 01:00)\n\n"+
            "AVVISO DI GARA\n" +
                    "\n" +
                    "Si comunica che l'ERSU di Cagliari, in esecuzione della Determinazione a contrarre del Direttore del Servizio Gestione Mense ed Alloggi n. 508 del 05/12/2016, intende procedere all'espletamento di una procedura negoziata informatizzata, ex art. 36 co. 2 lett. b) del D.lgs. 50/2016, da aggiudicarsi secondo il criterio del minor prezzo ai sensi dell’art. 95. co. 4 lett. a) del D.lgs 50/2016, per l'affidamento dei “lavori di manutenzione straordinaria sulle canne fumarie della Casa dello Studente di via Businco”. Rif. App. 03BO/2017. CIG Z5B1C3E390.\n" +
                    "Tale procedura sarà espletata sulla piattaforma DigitalPA, con riferimento ID 47, rivolta a cinque Operatori Economici selezionati casualmente a rotazione tra quelli abilitati nella categoria di lavori pubblici OG1 all’interno della stessa piattaforma.\n" +
                    "Tutta la documentazione di gara e progettuale è stata pubblicata sul portale www.digitalpa.it. La “Tavola 1.00 - Piante e particolari” potrà essere richiesta via mail all’Ufficio Tecnico e di Progettazione dell’Ente: ersuca.progetto@tiscali.it .\n" +
                    "Scadenza presentazione offerte: 29/01/2017 ore 23:59.\n" +
                    "Seduta di gara pubblica: 30/01/2017 ore 09:00.\n" +
                    "IL DIRETTORE DEL SERVIZIO AMMINISTRATIVO\n" +
                    "f.to dott.ssa Angela Maria Porcu",
            "Ultimo aggiornamento (Martedì 30 Novembre 1999 01:00)\n\n",
            "AVVISO DI AGGIUDICAZIONE\n" +
                    "PROCEDURA NEGOZIATA, EX ART. 36 CO. 2 LETT.B) DEL DLGS 50/2016, CON IL CRITERIO DEL MINOR PREZZO, MEDIANTE RICHIESTA DI OFFERTA (RDO) SUL MERCATO ELETTRONICO “SARDEGNA CAT” PER L’AFFIDAMENTO DEL “SERVIZIO DI PUBBLICAZIONE DELL’AVVISO DI AGGIUDICAZIONE DELLA GARA EUROPEA A PROCEDURA APERTA PER L’APPALTO DEI SERVIZI DI PULIZIA E SERVIZI ACCESSORI DELLE RESIDENZE E UFFICI DELL'AMMINISTRAZIONE DELL’E.R.S.U.” RIF.APP. 93PO/2016 CIG Z141C9D3C3\n" +
                    "Si comunica che, a seguito di gara a procedura negoziata indetta con il criterio del minor prezzo, l’E.R.S.U. ha stipulato il 03/01/2017 il contratto d’appalto in oggetto, relativo alla RdO n. 310772, con prot. n. 00081 e Rep. n. 118/2017, con l’aggiudicatario “Vivenda srl, con sede in Roma corso Vittorio Emanuele II° n. 269 - P.IVA 08959351001.\n" +
                    "Importo del contratto: € 5.582,30 + IVA + € 16,00 per spese di bollo.\n" +
                    "IL DIRETTORE DEL SERVIZIO AMMINISTRATIVO\n" +
                    "f.to dott.ssa Angela Maria Porcu",
            "Ultimo aggiornamento (Venerdì 13 Gennaio 2017 11:44)\n\n",
            "ENTE REGIONALE PER IL DIRITTO ALLO STUDIO UNIVERSITARIO DI CAGLIARI\n" +
                    "Avviso di aggiudicazione di appalto. Rif. App. 74/2015 - CIG 6496871B8B.\n" +
                    "Sezione I: AMMINISTRAZIONE AGGIUDICATRICE: E.R.S.U. Corso Vittorio Emanuele II N.68 CAGLIARI 09124 Italia (IT) tel. +39 070/66201 fax +39 070/66206392, ersufficiocontratti@pcert.postecert.it, ersufficiocontratti@tiscali.it, www.ersucagliari.it\n" +
                    "SEZIONE II: OGGETTO: Servizi di pulizia e servizi accessori delle residenze e uffici dell'amministrazione dell’ERSU di Cagliari. CPV 90910000. Criterio di aggiudicazione: Offerta economicamente più vantaggiosa.\n" +
                    "SEZIONE IV: PROCEDURA: Aperta. Pubblicazione precedente GUUE: n. 2015 S 250- 458518 del 26/12/2015.\n" +
                    "SEZIONE V: AGGIUDICAZIONE: data contratto 19/10/2016. Offerte pervenute 11. Aggiudicatario Società EURO & PROMOS FM Soc. Coop. P.A., con sede legale in via Zanussi 11/13, Udine. PEC: europromosgare@legalmail.it. Valore totale iniziale appalto: servizio a corpo € 340.815,00 + IVA oltre a € 690,00 + IVA per gli oneri per la sicurezza; servizio extra canone a misura € 17.000,00 + IVA. Valore totale appalto: servizio a corpo € 285.602,97 + IVA oltre € 690,00 + IVA per oneri relativi alla sicurezza; servizio extra canone a misura € 11.900,00 + IVA. Subappalto: si.\n" +
                    "SEZIONE VI: ALTRE INFORMAZIONI: Determinazione di aggiudicazione del Direttore del Servizio Amministrativo n. 184 del 28/06/2016. Ricorso: TAR Sardegna. Spedizione avviso alla GUEE 02/01/2017.\n" +
                    "Il direttore del Servizio Amministrativo Dott.ssa Angela Maria Porcu.",

    };
    private static final int icons = R.drawable.ic_tonality_black_36dp;

    public static List<ListItem> getListData() {
        List<ListItem> data = new ArrayList<>();


            for (int i=0; i < titles.length; i++){
                ListItem item = new ListItem();
                item.setImageResId(icons);
                item.setTitle(titles[i]);
                item.setSubTitle(subTitles[i]);
                data.add(item);
            }

        return data;
    }



}
