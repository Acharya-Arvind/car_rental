
const scrollRevealOption = {
    origin: "bottom",
    distance: "50px",
    duration: 1000,
  };
  
  ScrollReveal().reveal(".header_container h1", {
    ...scrollRevealOption,
  });
  ScrollReveal().reveal(".header_container form", {
    ...scrollRevealOption,
    delay: 500,
  });
  ScrollReveal().reveal(".header_container img", {
    ...scrollRevealOption,
    delay: 1000,
  });