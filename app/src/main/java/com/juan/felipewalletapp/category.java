package com.juan.felipewalletapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

  public class category {
      private String nombre;
      private String descripcion;
      private  String color;
      private String icono;

      public String getNombre() {
          return nombre;
      }

      public void setNombre(String nombre) {
          this.nombre = nombre;
      }

      public String getDescripcion() {
          return descripcion;
      }

      public void setDescripcion(String descripcion) {
          this.descripcion = descripcion;
      }

      public String getColor() {
          return color;
      }

      public void setColor(String color) {
          this.color = color;
      }

      public String getIcono() {
          return icono;
      }

      public void setIcono(String icono) {
          this.icono = icono;
      }

      public category(String nombre, String descripcion, String color, String icono ) {
          this.nombre = nombre;
          this.descripcion = descripcion;
          this.color = color;
          this.icono = icono;
      }

}