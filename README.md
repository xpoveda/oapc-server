
Preparación para subida de repo
===============================
En el caso del server hacer un "make clean".
En el caso del front eliminar la carpeta node_modules o ignorarla cuando hagamos el "add" mas tarde.

Subida a github
===============
Para el server
```vi
crear repo en github "oapc-server"
git init
Con tortoisegit hacer un add de todos los fuentes con "Include ignored files" activo
git commit -m "first commit"
git remote add origin https://github.com/xpoveda/oapc-server.git
git push -u origin master
```

Para el front
-------------
```
crear repo en github "oapc-front"
git init
Con tortoisegit hacer un add de todos los fuentes con "Include ignored files" activo
git commit -m "first commit"
git remote add origin https://github.com/xpoveda/oapc-front.git
git push -u origin master
```

Descarga en local inicial
=========================
```shell
D:\oapc-app>git clone https://github.com/xpoveda/oapc-server.git
Cloning into 'oapc-server'...
remote: Counting objects: 65, done.
remote: Compressing objects: 100% (56/56), done.
Uremote: Total 65 (delta 1), reused 61 (delta 0), pack-reused 0
Unpacking objects: 100% (65/65), done.

D:\oapc-app>git clone https://github.com/xpoveda/oapc-front.git
Cloning into 'oapc-front'...
remote: Counting objects: 75, done.
remote: Compressing objects: 100% (52/52), done.
remote: Total 75 (delta 13), reused 71 (delta 12), pack-reused 0
Unpacking objects: 100% (75/75), done.
```

Sincronizacion del local con el repo
====================================
```
D:\oapc-app\oapc-server>git pull origin master
remote: Counting objects: 12, done.
remote: Compressing objects: 100% (12/12), done.
remote: Total 12 (delta 7), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (12/12), done.
From https://github.com/xpoveda/oapc-server
 * branch            master     -> FETCH_HEAD
   577c332..4b18b02  master     -> origin/master
Updating 577c332..4b18b02
Fast-forward
 README.md | 42 ++++++++++++++++++++++++++++++++++++++++++
 1 file changed, 42 insertions(+)
 ```
