# Car

## Enunciat
Has de crear una classe que representi un cotxe amb algunes particularitats que et permetran entendre com funciona la memòria i la inicialització en Java.

- #### Quin d'aquests atributs poden ser inicialitzats des del constructor?:
  L'atribut model (static) i l'atribut power (final). L'únic que no pot ser inicialitzat és brand (static final)

- #### Quin no es pot modificar mai?
  A un atribut final, quan se li assigna per primer cop un valor, no es pot tornar a modificar.
  
- #### Quin afecta totes les instàncies de la classe?
  Quan es modifica el valor d'un atribut static en una instància, canvia el valor de l'atribut en totes les altres instàncies de la classe.

  Un atribut static final, un cop inicialitzat, el seu valor queda fixat, i alhora és el mateix per a totes les instàncies.