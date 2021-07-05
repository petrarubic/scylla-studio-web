const defaultTheme = require('tailwindcss/defaultTheme')
module.exports = {
  future: {
    removeDeprecatedGapUtilities: true,
  },
  variants: {
    extend: {
      textColor: ['visited'],
      scale: ['group-hover'],
      fontWeight: ['hover', 'focus']
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