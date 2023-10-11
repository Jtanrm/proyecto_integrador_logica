package com.example.application.views.grupo2;

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
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Grupo 2")
@Route(value = "grupo-2", layout = MainLayout.class)
public class Grupo2View extends VerticalLayout {

    public Grupo2View() {
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
                "url(https://kmganalytics.com/wp-content/uploads/2021/10/RRSS-KMG-19-770x400.png)");

        H1 t1 = new H1("Grupo 2");
        H2 t2 = new H2("Finanzas");
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
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2FNatalia%20Alzate.png?alt=media&token=5da2038a-9674-46cb-9722-f30efb7e3771&_gl=1*67g1hk*_ga*Njc3MDY0MDYzLjE2OTYzODAyMzQ.*_ga_CW55HF8NVT*MTY5NjM4MDIzNC4xLjEuMTY5NjM4MTE4Ni42MC4wLjA.");
        est1.put("name", "Natalia Alzate");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image",
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2FRossember%20Restrepo.png?alt=media&token=83bcb57f-0cf3-49e8-b161-bed3103ff23f&_gl=1*1gn2mle*_ga*Njc3MDY0MDYzLjE2OTYzODAyMzQ.*_ga_CW55HF8NVT*MTY5NjM4MDIzNC4xLjEuMTY5NjM4MTIwOC4zOC4wLjA.");
        est2.put("name", "Rossember Restrepo");

        users.add(est1);
        users.add(est2);

        add(secciones.students(users));

        String titulo1;
        String titulo2;
        String descripcion;
        String gist;
        String replit;
        String diagrama;

        // Algoritmo1
        titulo1 = "Algoritmo1";
        titulo2 = "Simulador de ahorro";
        descripcion = "Este programa es un simulador de ahorros que te permite estimar cuánto dinero tendrás acumulado en una cuenta después de un periodo de tiempo determinado, considerando unos aportes periódicos y una tasa de interés efectiva anual.\r\n"
                + //
                "Finalmente conocerás el saldo acumulado después del periodo de tiempo indicado.\r\n" + //
                "";
        gist = "<script src=\"https://gist.github.com/Rossember01/63564f1e77b00ea92602cdde17a5a616.js\"></script>";
        replit = "https://replit.com/@rossember01/Simuladorahorro#Main.java";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/cesde-7fe22.appspot.com/o/Proyecto%20Integrador%2FDiagrama.svg?alt=media&token=e04cad73-fd1c-4972-a571-da1389d04689";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

    }

    public HorizontalLayout algoritmo1() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image("https://static.tuasaude.com/media/article/me/dr/imc_15748_l.jpg", ""));

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

}
