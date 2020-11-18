/*
 * package com.springboot.siicoreapp.controller;
 * 
 * import org.springframework.web.bind.annotation.ControllerAdvice; import
 * org.springframework.web.bind.annotation.ExceptionHandler; import
 * org.springframework.web.multipart.MultipartException; import
 * org.springframework.web.servlet.mvc.support.RedirectAttributes;
 * 
 * @ControllerAdvice public class GlobalExceptionHandler {
 * 
 * @ExceptionHandler(MultipartException.class) public String
 * handleMultipar(MultipartException e, RedirectAttributes attr) {
 * attr.addFlashAttribute("message", e.getCause().getMessage());
 * 
 * return "redirect:/status"; } }
 */