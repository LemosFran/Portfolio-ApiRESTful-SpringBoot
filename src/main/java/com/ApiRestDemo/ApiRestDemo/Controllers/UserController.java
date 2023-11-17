/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ApiRestDemo.ApiRestDemo.Controllers;

import com.ApiRestDemo.ApiRestDemo.Entities.UserEntity;
import com.ApiRestDemo.ApiRestDemo.Repositories.UserRepository;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import javax.websocket.ClientEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author franc
 */

@RestController
@RequestMapping("/api")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;
    
    @PostMapping("/usuarios")
    private UserEntity crearUsuario(@RequestBody UserEntity usuario)
    {
        return userRepository.save(usuario);
    }
    
    @GetMapping("/usuarios")
    public List<UserEntity> listarUsuarios()
    {
        return userRepository.findAll();
    }
    
    @PutMapping("/usuarios/{id}")
    public UserEntity modificarUsuario(@PathVariable Long id, @RequestBody UserEntity usuario)
    {
        
       Optional<UserEntity> optionalUser = userRepository.findById(id); //con el opcional hacemos una tipo verificación si no tenemos la excep.
        
        if(optionalUser.isPresent()){
            UserEntity user = optionalUser.get();
            
            user.setNombre(usuario.getNombre());
            user.setApellido(usuario.getApellido());
            user.setEdad(usuario.getEdad());
            user.setEmail(usuario.getEmail());
            
            userRepository.save(user);
            
        return user;
        }else{
             throw new NoSuchElementException("El usuario con ID " + id + " no fue encontrado");
             //Para que sirve NoSuchElementException?
             //Por que este "throw" si se puede ejecutar y no hace falta el "throws"?
        }
      
       //TODO MAL HECHO, CREAR LA EXCEPCION SI O SI
    }
    
    
    @GetMapping("/usuarios/{id}")
    public UserEntity buscarPorId(@PathVariable Long id)
    {
        Optional<UserEntity>  userResponse = userRepository.findById(id);
        
        if(userResponse.isPresent())
        {
            UserEntity user = userResponse.get();
            
            return user;
            
        }else{
            throw new NoSuchElementException("El ...");
        }
        
    }
    
    
    @DeleteMapping("/usuarios/{id}")
    public UserEntity borrarUsuario(@PathVariable Long id)
    {
        Optional<UserEntity> userResponse = userRepository.findById(id);
        
        if(userResponse.isPresent()){
            UserEntity user = userResponse.get();
            
            userRepository.delete(user);
            
            return user;
            
        }else{
            throw new NoSuchElementException("Bla bla ...");
        }
    }
    
}
