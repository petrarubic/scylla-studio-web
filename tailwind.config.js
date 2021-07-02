const defaultTheme = require('tailwindcss/defaultTheme')
module.exports = {
  future: {
    removeDeprecatedGapUtilities: true,
  },
  variants: {
    extend: {
      textColor: ['visited'],
      scale: ['group-hover']
    }
  },
  theme: {
    extend: {
      fontFamily: {
        montserrat: ['Montserrat']
      }
    }
  }
};