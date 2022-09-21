package co.com.conversor.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.JOptionPane;

import co.com.conversor.model.Operacion;
import co.com.conversor.model.OpcionConversor;
import co.com.conversor.controller.ConversorController;

public class Programa {

    public Programa() {

        presentarMenu();

    }

    private void presentarMenu() {

		Object[] conversores = { "Conversor de Moneda", "Conversor de Temperatura" };

		int respuesta = 0;

		do {

			Object conversorSelect = messageOptions(conversores, "Seleccionar una opción de conversión", "Menú");

			try {

				double cantidadConvertir = Double.parseDouble(messageInput());

				if (conversorSelect == "Conversor de Moneda") {

					hacerConversion(opcionesMoneda(), cantidadConvertir, 1);

				} else {

					hacerConversion(opcionesTemperatura(), cantidadConvertir, 2);

				}

			} catch (Exception e) {

				mensajeError();

			}

			respuesta = mensajeDecision();

		}

		while (respuesta == 0);

		mensajeInfo("Programa terminado");

	}