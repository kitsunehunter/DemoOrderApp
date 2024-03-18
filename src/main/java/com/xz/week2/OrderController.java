package com.xz.week2;

//OrderController.java
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	

 @PostMapping("/submitOrder")
 public String submitOrder(Order order, Model model) {
     // Here, you would typically save the order to a database or perform further processing
     // For simplicity, let's assume you want to display the order details on the "show-order.html" page

     // Add order attributes to the model
     model.addAttribute("name", order.getName());
     model.addAttribute("email", order.getEmail());
     model.addAttribute("phone", order.getPhone());
     model.addAttribute("phoneModel", order.getPhoneModel());
     model.addAttribute("phonePrice", order.getPhonePrice());
     model.addAttribute("quantity", order.getQuantity());
     model.addAttribute("street", order.getStreet());
     model.addAttribute("city", order.getCity());
     model.addAttribute("state", order.getState());
     model.addAttribute("postalCode", order.getPostalCode());
     model.addAttribute("country", order.getCountry());

     // Redirect to the show-order page
     return "redirect:/show-order";
     
 }
 
 @RequestMapping("/about")
 public String about() {
     return "about"; 
 }
 
 //@RequestMapping("/show-order")
 //public String showOrder() {
 //    return "show-order";
 //}
 


 
}


