package it.unipv.sfw.esame.progettoC23.controller;

import it.unipv.sfw.esame.progettoC23.Persona;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.Iscrizione;
import it.unipv.sfw.esame.progettoC23.jdbc.bean.IscrizioneDAO;
import it.unipv.sfw.esame.progettoC23.view.IscrittoView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class IscrittoContoller {

    //private final Rinnovo rinnovo;
    private final IscrittoView view;
    //private final Badge badge;
    private Calendar primaIscrizione = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
    String[] iscritti = new String[4];

    public IscrittoContoller(IscrittoView view) {

        //this.rinnovo=rinnovo;
        this.view = view;
        //this.badge=badge;

        setListeners();
    }

    public void setListeners() {

        view.getVediRinnovo().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                view.setRinnovo(view.getRinnovo());

            }
        });


        view.getVediBadge().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                view.setBadge(view.getCf());

            }

        });

        view.getAggiungiIscritto().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Persona p = new Persona(view.getCf(), view.getNome(),
                        view.getCognome(), view.getDatadiNascita());

                IscrizioneDAO id = new IscrizioneDAO();
                Iscrizione g = new Iscrizione(p.getCF(), p.getNome(), p.getCognome(), p.getDataNascita());
                System.out.println(id.selectAll());
                System.out.println(id.insertIscritto(g));


            }

        });


    }


}
