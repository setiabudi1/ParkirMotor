package uas.parkir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import uas.parkir.entity.Parkir;
import uas.parkir.repo.ParkirRepo;

@RestController
public class ApiController {

    @Autowired
    private ParkirRepo parkirRepo;

    @RequestMapping("/daftar-parkir")
    public List<Parkir> getDaftarParkir() {
        List<Parkir> data = parkirRepo.findAll();
        for(int i=0; i<data.size(); i++) {
            System.out.println(((Parkir) data.get(i)).getNama());
        }
        return parkirRepo.findAll();
    }

    @RequestMapping(value = "/api/tambah", method = RequestMethod.POST) 
    public void tambahData(@RequestBody Parkir parkir) {
        //System.out.println("id : " + parkir.getId());
        //System.out.println("nama :  "+ parkir.getNama());
        //System.out.println("plat : " + parkir.getPlat());
        parkirRepo.save(parkir);
    }

    @RequestMapping(value = "/api/hapus/{id}", method = RequestMethod.DELETE)
    public void hapusData(@PathVariable("id") int id) {
        parkirRepo.delete(id);
    }

}