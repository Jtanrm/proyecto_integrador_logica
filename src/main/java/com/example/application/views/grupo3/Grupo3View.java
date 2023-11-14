package com.example.application.views.grupo3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.application.views.MainLayout;
import com.example.application.views.Secciones;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Grupo 3")
@Route(value = "grupo-3", layout = MainLayout.class)
public class Grupo3View extends VerticalLayout {

    public Grupo3View() {
        setAlignItems(Alignment.CENTER);
        setSizeFull();

        VerticalLayout vl = new VerticalLayout();
        vl.setJustifyContentMode(JustifyContentMode.CENTER);
        vl.setAlignItems(Alignment.CENTER);
        vl.setWidthFull();
        vl.setHeight("300px");
        vl.setMinHeight("300px");
        vl.scrollIntoView();

        vl.getStyle().set("background-position", "center");
        vl.getStyle().set("background-repeat", "no-repeat");
        vl.getStyle().set("background-size", "cover");
        vl.getStyle().set("background",
                "url(https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2Ffotos%20de%20la%20descripcion%2Fdeportes3-fotor-20231011115722-fotor-2023101112019.jpg?alt=media&token=81983449-4a02-4e07-9b73-98e2c8f1e4b5&_gl=1*j2jxxj*_ga*MTAyMjY3NzI1MC4xNjk1MTU5NTY0*_ga_CW55HF8NVT*MTY5NzA0MDkxOC4zLjEuMTY5NzA0MzY0Mi41MC4wLjA.)");

        H1 t1 = new H1("Grupo 3");
        H2 t2 = new H2("Deportes y Salud");
        t1.getStyle().set("color", "white");
        t2.getStyle().set("color", "white");
        t1.getStyle().set("text-shadow", "#000 3px 0 15px");
        t2.getStyle().set("text-shadow", "#000 3px 0 15px");
        vl.add(t1);
        vl.add(t2);
        vl.add(new Hr());

        add(vl);
        Secciones secciones = new Secciones();
        ArrayList<Map<String, String>> users = new ArrayList<>();

        // Integrantes
        Map<String, String> est1 = new HashMap<>();
        est1.put("image",
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2Fander-fotor-2023100320298.png?alt=media&token=61e3563e-6726-4171-8b7c-96c708e7089d&_gl=1*1bq3k5u*_ga*Njc3MDY0MDYzLjE2OTYzODAyMzQ.*_ga_CW55HF8NVT*MTY5NjM4MDIzNC4xLjEuMTY5NjM4MzA5Ni43LjAuMA..");
        est1.put("name", "Anderson Alzate");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image",
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2FJuan%20Carlos%20Garcia.png?alt=media&token=76f7c92a-be0a-48c0-a4a0-384078f849f0&_gl=1*28rch0*_ga*Njc3MDY0MDYzLjE2OTYzODAyMzQ.*_ga_CW55HF8NVT*MTY5NjM4MDIzNC4xLjEuMTY5NjM4MTQ5Ny42MC4wLjA.");
        est2.put("name", "Juan Carlos Garcia");
        Map<String, String> est3 = new HashMap<>();
        est3.put("image",
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2FEdward-fotor-20231003184023.png?alt=media&token=db2969c8-e3b3-4b3a-a72b-21327292cc87&_gl=1*1szk2i2*_ga*Njc3MDY0MDYzLjE2OTYzODAyMzQ.*_ga_CW55HF8NVT*MTY5NjM4MDIzNC4xLjEuMTY5NjM4MTU0Ni4xMS4wLjA.");
        est3.put("name", "Edward Muñoz");

        users.add(est1);
        users.add(est2);
        users.add(est3);
        add(secciones.students(users));

        String titulo1;
        String titulo2;
        String descripcion;
        String gist;
        String replit;
        String diagrama;

        // Algoritmo1
        titulo1 = "Algoritmo 1";
        titulo2 = "Calculadora Índice de Masa Corporal (IMC)";
        descripcion = " El Índice de Masa Corporal (IMC) es la cifra que te ayuda a averiguar si tu peso corporal es el adecuado o no.\r\n" + //
                "Esta calculadora es una herramienta útil para averiguar rápidamente si tu peso corporal está situado, por ejemplo, en la zona de sobrepeso, pero hay que tener en cuenta que este índice no contempla las diferentes densidades de la masa muscular, grasa corporal o la masa ósea. En el caso de los deportistas que tienen una masa muscular muy desarrollada, el resultado de este cálculo podría indicar erróneamente que  padece sobrepeso. También hay que tener cuidado en los resultados obtenidos en personas embarazadas o en edad avanzada, ya que se tratan de casos especiales y en todo caso habría que tener en cuenta otros parámetros para determinar su IMC:\r\n" + //
                " ";
        gist = " <script src=\"https://gist.github.com/JuanGarciaRodas/8a2a9370c109e6607856398500e08398.js\"></script> ";
        replit = "https://replit.com/@Juan-Carlos1328/IMC";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/algoritmos%2Fcode2flow_5TWySH.png?alt=media&token=27493753-419b-4519-8316-41f9fbeda9d5&_gl=1*1lrll67*_ga*MTAyMjY3NzI1MC4xNjk1MTU5NTY0*_ga_CW55HF8NVT*MTY5ODE2MzI0OC42LjEuMTY5ODE2MzM1My4xNS4wLjA.";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

        // Algoritmo2
        titulo1 = "Algoritmo 2";
        titulo2 = "Simulador de partidos";
        descripcion = "Simulación de Resultados de partidos: El usuario ingresa dos equipos, los cuales competirán por varios partidos hasta que alguno de los 2 complete 15 puntos o jueguen 8 partidos,\r\n"
                + //
                "si el partido queda (0 - 0), sería partido no válido y deberá repetir el partido\r\n" + //
                "";
        gist = "<script src=\"https://gist.github.com/Alexpian7/406b61e9ecce6f3f559dd4bb8ba5aaf1.js\"></script>";
        replit = "https://replit.com/@aaalzate5/Proyecto1#Main.java";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/algoritmos%2Fcode2flow_5TWySH%20(1).png?alt=media&token=863d3f67-0d1f-4ce2-8fd5-b5bbd168578f&_gl=1*12q2isi*_ga*MTAyMjY3NzI1MC4xNjk1MTU5NTY0*_ga_CW55HF8NVT*MTY5ODE2MzI0OC42LjEuMTY5ODE2MzgyMS40Ni4wLjA.";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo2(), gist, replit, diagrama));

        // Algoritmo3
        titulo1 = "Algoritmo 3";
        titulo2 = "Calculador de Velocidad";
        descripcion = "Es un ejercicio en el que se calcula la velocidad de un deportista en Km/h dado su tiempo en carrera y la distancia recorrida" + //
                "";
        gist = "<script src=\"https://gist.github.com/xeduark/3b1d5487b91f1fd5a6b0fc40eac44585.js\"></script>";
        replit = "https://replit.com/@EdwardMunoz/eje3#Main.java";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/algoritmos%2Fcode2flow_2rHKvV.png?alt=media&token=d681fadd-0948-44af-8acf-e736314d739f&_gl=1*1t3nn3j*_ga*MTAyMjY3NzI1MC4xNjk1MTU5NTY0*_ga_CW55HF8NVT*MTY5ODE3MTMwMS43LjEuMTY5ODE3MTMxNi40NS4wLjA.";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo3(), gist, replit, diagrama));

    }

    public HorizontalLayout algoritmo1() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2Ffotos%20de%20la%20descripcion%2Fimc1-fotor-202310111296.jpg?alt=media&token=0e856adc-2359-4a69-9ab4-82a549ab56c4&_gl=1*1l79lkf*_ga*MTAyMjY3NzI1MC4xNjk1MTU5NTY0*_ga_CW55HF8NVT*MTY5NzA0MDkxOC4zLjEuMTY5NzA0NDE3Ni43LjAuMA..",
                ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        NumberField peso = new NumberField("Peso (kg)");
        NumberField altura = new NumberField("Altura (m)");
        Button calcular = new Button("Calcular IMC");
        H3 salida = new H3();

        calcular.addClickListener(event -> {
            double valorPeso = peso.getValue();
            double valorAltura = altura.getValue();
            double imc = valorPeso / Math.pow(valorAltura, 2);
            String info = "";
            if (imc < 18.5) {
                info = "Bajo peso";
            } else if (imc >= 18.5 && imc < 24.9) {
                info = "Peso saludable";
            } else if (imc >= 25.0 && imc < 29.9) {
                info = "Sobrepeso";
            } else if (imc >= 30.0 && imc < 34.9) {
                info = "Obesidad Clase 1";
            } else if (imc >= 35.0 && imc < 39.9) {
                info = "Obesidad Clase 2";
            } else {
                info = "Obesidad Clase 3";
            }
            String numeroFormateado = String.format("%.2f", imc);
            salida.setText(String.valueOf(numeroFormateado + ", " + info));
        });
        vl2.add(new H3("Calculadora Índice de Masa Corporal (IMC)"));
        vl2.add(peso);
        vl2.add(altura);
        vl2.add(calcular);
        vl2.add(salida);
        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }

    public HorizontalLayout algoritmo2() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2Ffotos%20de%20la%20descripcion%2F818eab1d9e1963313a2e2710ae84daf9-fotor-20231010195945-fotor-20231010205323.jpg?alt=media&token=e5b2f6f9-0e16-4544-90fc-daa1eab6f1d6&_gl=1*1pmg29g*_ga*MTAyMjY3NzI1MC4xNjk1MTU5NTY0*_ga_CW55HF8NVT*MTY5NzA0MDkxOC4zLjEuMTY5NzA0NDg4MC42MC4wLjA.",
                ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        TextField Equipo1 = new TextField("Equipo 1");
        TextField Equipo2 = new TextField("Equipo 2");
        Button simular = new Button("Simulación");
        H3 m1 = new H3("");

        simular.addClickListener(event -> {
            int puntajeUno = 0, puntajeDos = 0;
            int partido = 0;

            while (partido <= 8) {
                int goles1 = (int) (Math.random() * 5);
                int goles2 = (int) (Math.random() * 5);
                if (goles1 > goles2) {
                    puntajeUno += 3;
                } else if (goles2 > goles1) {
                    puntajeDos += 3;
                } else if (goles1 > 0 && goles1 == goles2) {
                    puntajeUno++;
                    puntajeDos++;
                } else {
                    System.out.print("Partido no valido");
                    continue;
                }
                partido++;
                System.out.print("Resultado del partido " + partido + "\n");
                System.out
                        .print(Equipo1.getValue() + " <" + goles1 + " - " + goles2 + "> " + Equipo2.getValue() + "\n");
                if (puntajeUno >= 15 || puntajeDos >= 15) {
                    break;
                }
            }
            partido--;
            String m2 = ("Se jugaron " + partido + " partidos :"+" "+"El " + Equipo1.getValue() + " consiguió " + puntajeUno + " puntos, "+" "+ "El " + Equipo2.getValue() + " consiguió " + puntajeDos + " puntos");
           
            if (puntajeUno > puntajeDos) {
                m2+= " Felicitaciones, su equipo ganó!!";
                // System.out.print(" Felicitaciones, su equipo ganó");
            } else {
                m2+= " Lo sentimos, su equipo no ganó...";
                // System.out.print(" Lo sentimos, su equipo no ganó");
            }
            m1.setText(m2);

        });
        vl2.add(new H3("Ingresa el nombre de el equipo que te gusta y un rival"));
        vl2.add(Equipo1);
        vl2.add(Equipo2);
        vl2.add(simular);
        vl2.add(m1);
        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }
    double dis, min, seg, cen, tse, vms, vkh;
    public HorizontalLayout algoritmo3() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2Ffotos%20de%20la%20descripcion%2Fcorredor-pista-atletismo-768x512-fotor-20231031102144.jpg?alt=media&token=ebf53579-464c-4e40-a598-e9ca2278b63a&_gl=1*pkb7i8*_ga*MTAyMjY3NzI1MC4xNjk1MTU5NTY0*_ga_CW55HF8NVT*MTY5ODc2NDQ3Ni44LjEuMTY5ODc2NTcyOC40Ni4wLjA.",
                ""));

                VerticalLayout vl2 = new VerticalLayout();
                vl2.setAlignItems(Alignment.CENTER);
        
                HorizontalLayout hl = new HorizontalLayout();
                hl.setAlignItems(Alignment.CENTER);
                hl.setWidthFull();
        
                NumberField dis = new NumberField("distancia (en metros):");
                NumberField min = new NumberField("distancia recorrida en minutos:");
                NumberField seg = new NumberField("distancia recorrida en segundos:");
                NumberField cen = new NumberField("distancia recorrida en centésimas:");
                Button calcular = new Button("Calcular");
                H3 result = new H3("0");
        
                calcular.addClickListener(event -> {

                    vkh=((dis.getValue()/((min.getValue()*60)+seg.getValue()+(cen.getValue()/100)))*3600)/1000;
                    result.setText(String.valueOf("La velocidad es de: "+vkh+" km/h"));
                });
        
                vl2.add(new H3("Eres rapido? vamos a averiguarlo..."));
                vl2.add(dis);
                vl2.add(min);
                vl2.add(seg);
                vl2.add(cen);
                vl2.add(calcular);
        
                vl2.add(result);
                hl.add(vl1);
                hl.add(vl2);
                return hl;
    }

}
