# java 개발자 도구
1. jdk 17 설치 : java.com
2. 7zip 설치 : 7zip.org
3. D2codoing font 설치
4. eclipse 설치 : eclipse.org

## git repository 생성
1. 새로운 컴퓨에서 최초로 github를 사용하고자 할 때 설정
```bash
  git config --global user.name hee462

  git config --global user.email a01080809887@gmail.com

```
2. 새로운 원격 repository를 생성하고,local Repository 생성하고자할때
```bash
git init
```

3. Roepository 에 대한 설명을 하기 위하여 README.md 파일생성하기

4. 원격 repository 별명 설정하기 : git remote add origin https://github.com/hee462/Biz-2023-04-java.git

### 기존의 repository에 개속해서 update 하고자 할때
 

- 현재 폴더의 파일과 폴더를  local Repository에압축하고, 암호화하여 보관하기 : `git add .`

- 현재 local Repository에 보관된 압축된 데이터에 대한 Comment 를 추가하기 : ` git commit-m first`

- locsl Repository에 보관된 압축된 데이터를 원격 Repository로 push : `git push -u origin master`

``` bash
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/hee462/Biz-2023-04-java.git
git push -u origin master