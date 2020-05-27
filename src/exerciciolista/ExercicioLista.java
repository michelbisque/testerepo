/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciolista;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import entidade.Empregado;
/**
 *
 * @author miche
 */
public class ExercicioLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);   
     List <Empregado> list = new ArrayList<>();
     
        System.out.println("Quantos empregados pretende registrar? ");
        int nr=sc.nextInt();
        
        for(int i=0; i<nr; i++){
            System.out.println("Empregado #"+(i+1));
            System.out.println("ID:");
            int id=sc.nextInt();
            while (hasId(list, id)) { //VER SE JA EXISTE O ID
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
            sc.nextLine();
            System.out.println("Nome: ");
            String nome=sc.nextLine();
            System.out.println("Salario: ");
            double salario=sc.nextDouble();
            list.add(new Empregado(id,nome,salario));
        }        
         for(Empregado obj: list){
            System.out.println(obj);
        }
         
         System.out.println("------------------------");
         System.out.println("Introduza o id do empregado para aumentar salario: ");
         int id=sc.nextInt();        
         Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentagem = sc.nextDouble();
			emp.addSalario(percentagem);
		}
          for(Empregado obj: list){
            System.out.println(obj);
        } 
           
    }
    public static boolean hasId(List<Empregado> list, int id) {
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
    
}
