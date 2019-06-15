# model-driven-engineering-project
University project on the topic of Model-driven Engineering.
MDE basically consists in the high-level modeling of a given problem, which allow to automatically generate low-level artifacts (e.g. source code, binary code, etc.).

For this project, the following steps were performed:
- definition of the meta-model of a given domain case (fashion) in Ecore with EMF (Eclipse Modeling Framework)
  - it.polimi.ase.projectB2.team20/metamodel/fashion.ecore
  - it.polimi.ase.projectB2.team20/metamodel/fashion.ecore_diagram
- definition of OCL (Object Constraint Language) constraints for the meta-model
  - it.polimi.ase.projectB2.team20/metamodel/fashion.ocl
- definition of a textual concrete syntax transformation by defining the grammar of a DSL with XText for the domain case
  - it.polimi.ase.projectB2.team20.xtext/src/it/polimi/ase/projectB2/team20/xtext/FashionDsl.xtext
- definition of a graphical concrete syntax with GMF
  - it.polimi.ase.projectB2.team20/metamodel/graphical_syntax/fashion.emf
- definition of a model-to-model transformation with ATL from the previously defined metamodel to a target metamodel
  - FashionDomain2Agenda/FashionDomain2Agenda.atl
