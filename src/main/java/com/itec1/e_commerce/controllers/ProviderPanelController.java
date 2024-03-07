/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itec1.e_commerce.controllers;

import com.itec1.e_commerce.entities.Provider;
import com.itec1.e_commerce.services.ProviderServiceImpl;
import com.itec1.e_commerce.views.Management_Providers_Panel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pania
 */
public class ProviderPanelController implements IController<Provider> {

    private final ProviderServiceImpl providerService;
    private final Management_Providers_Panel providerPanel;

    public ProviderPanelController(Management_Providers_Panel providerPanel) {
        this.providerService = new ProviderServiceImpl();
        this.providerPanel = providerPanel;
    }

    @Override
    public List<Provider> updateTable(String cuit) {
        DefaultTableModel model = new DefaultTableModel();
        String[] titles = {"Id", "Nombre", "Apellido", "C.U.I.T.", "Direción", "Correo", "Teléfono"};
        model.setColumnIdentifiers(titles);
        List<Provider> providers = providerService.findAll();
        List<Provider> result = new ArrayList<>();
        for (Provider pr : providers) {
            if (pr.getCuit().startsWith(cuit)) {
                Object[] object = {pr.getId(), pr.getName(), pr.getLastname(), pr.getCuit(), pr.getAddress(),
                    pr.getEmail(), pr.getPhone()};
                model.addRow(object);
                result.add(pr);
            }
        }
        this.providerPanel.getTable().setModel(model);
        return result;
    }

    @Override
    public String create(Provider entity) {
        if (findByCuit(entity.getCuit()) != null) {
            return "ERROR. Este CUIT ya pertenece a un provedor.";
        } else {
            providerService.create(entity);
        }
        return "Provedor creado correctamente.";
    }

    @Override
    public String update(Long id, Provider entity) {
        try {
            providerService.update(id, entity);
        } catch (EntityNotFoundException e) {
            return "ERROR. este provedor no existe";
        } catch (Exception e) {
            return "ERROR: " + e.getMessage();
        }
        return "Provedor actualizado correctamente";
    }

    @Override
    public Provider findById(Long id) {
        return providerService.findById(id);
    }

    public Provider findByCuit(String cuit) {
        return providerService.findByCuit(cuit);
    }

    @Override
    public List<Provider> findAll() {
        return providerService.findAll();
    }

    @Override
    public String disable(Long id) {
        Provider provider = providerService.findById(id);
        if (!provider.getEnable()) {
            return "ERROR. Este provedor ya se encuentra eliminado.";
        } else {
            try {
                providerService.disable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Este provedor no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Provedor eliminado correctamente.";
    }

    @Override
    public String enable(Long id) {
        Provider provider = providerService.findById(id);
        if (provider.getEnable()) {
            return "ERROR. Este provedor no se encuentra eliminado.";
        } else {
            try {
                providerService.enable(id);
            } catch (EntityNotFoundException e) {
                return "ERROR. Este provedor no existe.";
            } catch (Exception e) {
                return "ERROR: " + e.getMessage();
            }
        }
        return "Provedor recuperado correctamente.";
    }
}