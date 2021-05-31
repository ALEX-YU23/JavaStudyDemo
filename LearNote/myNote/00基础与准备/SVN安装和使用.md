# SVN的安装和使用

## 1、简介

SVN是subversion的缩写，是一个开放源代码的版本控制系统，通过采用分支管理系统的高效管理，简而言之就是用于多个人共同开发同一个项目，实现共享资源，实现最终集中式的管理

对编程人员而言，版本控制技术是团队协作开发的桥梁，有助于多人同步进行大型程序开发。由于在多人协作开发的模式下，每个人都向服务器提交自己的文件，就可能存在着代码被多次修改、替换的风险，但是版本控制能够在每次更新操作后进行相应的记录。一旦发生误操作，开发者能够根据服务器中的版本记录，将项目恢复到出现问题之前的其他版本。因此，借助版本控制技术，软件开发项目可以被分割为若干模块，每个模块并行地进行开发工作，从而有效地提高了整体编程效率。

## 2.主要作用

（1）目录版本控制

 Subversion 作了一个 "虚拟" 的版本控管文件系统, 能够依时间跟踪整个目录的变动。 目录和文件都能进行版本控制。

（2）真实的版本历史

在Subversion中，你可以增加（add）、删除（delete）、复制（copy）和重命名（rename），无论是文件还是目录。所有的新加的文件都从一个新的、干净的版本开始。

（3）自动提交

一个提交动作，不是全部更新到了档案库中，就是不完全更新。这允许开发人员以逻辑区间建立并提交变动，以防止当部分提交成功时出现的问题。

## **3.基本概念**

### SVN 的一些概念

- **repository（源代码库）:**源代码统一存放的地方
- **Checkout（提取）:**当你手上没有源代码的时候，你需要从repository checkout一份
- **Commit（提交）:**当你已经修改了代码，你就需要Commit到repository
- **Update (更新):**当你已经Checkout了一份源代码， Update一下你就可以和Repository上的源代码同步，你手上的代码就会有最新的变更

日常开发过程其实就是这样的（假设你已经Checkout并且已经工作了几天）：Update(获得最新的代码) -->作出自己的修改并调试成功 --> Commit(大家就可以看到你的修改了) 。

如果两个程序员同时修改了同一个文件呢, SVN 可以合并这两个程序员的改动，实际上SVN管理源代码是以行为单位的，就是说两个程序员只要不是修改了同一行程序，SVN都会自动合并两种修改。如果是同一行，SVN 会提示文件 Conflict, 冲突，需要手动确认

## 4.工作流程

![image-20210324171026042](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324171026042.png)

## 5.生命周期

### 创建版本库

版本库相当于一个集中的空间，用于存放开发者所有的工作成果。版本库不仅能存放文件，还包括了每次修改的历史，即每个文件的变动历史。

Create 操作是用来创建一个新的版本库。大多数情况下这个操作只会执行一次。当你创建一个新的版本库的时候，你的版本控制系统会让你提供一些信息来标识版本库，例如创建的位置和版本库的名字。

------

### 检出

Checkout 操作是用来从版本库创建一个工作副本。工作副本是开发者私人的工作空间，可以进行内容的修改，然后提交到版本库中。

------

### 更新

顾名思义，update 操作是用来更新版本库的。这个操作将工作副本与版本库进行同步。由于版本库是由整个团队共用的，当其他人提交了他们的改动之后，你的工作副本就会过期。

让我们假设 Tom 和 Jerry 是一个项目的两个开发者。他们同时从版本库中检出了最新的版本并开始工作。此时，工作副本是与版本库完全同步的。然后，Jerry 很高效的完成了他的工作并提交了更改到版本库中。

此时 Tom 的工作副本就过期了。更新操作将会从版本库中拉取 Jerry 的最新改动并将 Tom 的工作副本进行更新。

------

### 执行变更

当检出之后，你就可以做很多操作来执行变更。编辑是最常用的操作。你可以编辑已存在的文件，例如进行文件的添加/删除操作。

你可以添加文件/目录。但是这些添加的文件目录不会立刻成为版本库的一部分，而是被添加进待变更列表中，直到执行了 commit 操作后才会成为版本库的一部分。

同样地你可以删除文件/目录。删除操作立刻将文件从工作副本中删除掉，但该文件的实际删除只是被添加到了待变更列表中，直到执行了 commit 操作后才会真正删除。

Rename 操作可以更改文件/目录的名字。"移动"操作用来将文件/目录从一处移动到版本库中的另一处。

------

### 复查变化

当你检出工作副本或者更新工作副本后，你的工作副本就跟版本库完全同步了。但是当你对工作副本进行一些修改之后，你的工作副本会比版本库要新。在 commit 操作之前复查下你的修改是一个很好的习惯。

Status 操作列出了工作副本中所进行的变动。正如我们之前提到的，你对工作副本的任何改动都会成为待变更列表的一部分。Status 操作就是用来查看这个待变更列表。

Status 操作只是提供了一个变动列表，但并不提供变动的详细信息。你可以用 diff 操作来查看这些变动的详细信息。

------

### 修复错误

我们来假设你对工作副本做了许多修改，但是现在你不想要这些修改了，这时候 revert 操作将会帮助你。

Revert 操作重置了对工作副本的修改。它可以重置一个或多个文件/目录。当然它也可以重置整个工作副本。在这种情况下，revert 操作将会销毁待变更列表并将工作副本恢复到原始状态。

------

### 解决冲突

合并的时候可能会发生冲突。Merge 操作会自动处理可以安全合并的东西。其它的会被当做冲突。例如，"hello.c" 文件在一个分支上被修改，在另一个分支上被删除了。这种情况就需要人为处理。Resolve 操作就是用来帮助用户找出冲突并告诉版本库如何处理这些冲突。

------

### 提交更改

Commit 操作是用来将更改从工作副本到版本库。这个操作会修改版本库的内容，其它开发者可以通过更新他们的工作副本来查看这些修改。

在提交之前，你必须将文件/目录添加到待变更列表中。列表中记录了将会被提交的改动。当提交的时候，我们通常会提供一个注释来说明为什么会进行这些改动。这个注释也会成为版本库历史记录的一部分。Commit 是一个原子操作，也就是说要么完全提交成功，要么失败回滚。用户不会看到成功提交一半的情况。

## 6.安装SVN服务器端

1.准备svn的安装文件

下载地址：https://www.visualsvn.com/server/download/

![image-20210324171846280](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324171846280.png)

2、下载完成后，在相应的盘符中会有一个Setup-Subversion-*.msi的文件，然后双击安装文件进行安装

<img src="https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324172530334.png" alt="image-20210324172530334" style="zoom:80%;" />

![image-20210324172443034](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324172443034.png)

下一步

![image-20210324172628984](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324172628984.png)

接受协议下一步

![image-20210324172743589](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324172743589.png)

下一步

![image-20210324173001592](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324173001592.png)

下一步

![image-20210324173042957](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324173042957.png)

下一步

![image-20210324173208312](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324173208312.png)

![image-20210324173549473](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324173549473.png)

<img src="https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324173635101.png" alt="image-20210324173635101" style="zoom:80%;" />

至此，windows下的SVN安装完成

## 7.安装SVN客户端TortoiseSVN

下载地址：https://tortoisesvn.net/downloads.html

<img src="https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324205142494.png" alt="image-20210324205142494" style="zoom: 50%;" />

<img src="https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324205452194.png" alt="image-20210324205452194" style="zoom:150%;" />

<img src="https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324205525461.png" alt="image-20210324205525461" style="zoom:150%;" />

<img src="https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324205609263.png" alt="image-20210324205609263" style="zoom:150%;" />

<img src="https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324205732304.png" alt="image-20210324205732304" style="zoom:150%;" />

<img src="https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324205852380.png" alt="image-20210324205852380" style="zoom:150%;" />

![image-20210324205943743](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324205943743.png)



右键鼠标看见小乌龟的图标，表示安装成功

## 8.svn的基本配置

设置IP和端口

<img src="https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324211813905.png" alt="image-20210324211813905" style="zoom: 80%;" />

![image-20210324211939674](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324211939674.png)

![image-20210324212041718](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324212041718.png)

![image-20210324212157108](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324212157108.png)

![image-20210324212543782](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324212543782.png)

![image-20210324212624125](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324212624125.png)

## svn的使用

新建版本库

![image-20210324213109482](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324213109482.png)

![image-20210324213250495](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324213250495.png)

![image-20210324213344058](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324213344058.png)

![image-20210324213426453](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324213426453.png)

设置用户权限

![image-20210324213531620](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324213531620.png)

<img src="https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324213655586.png" alt="image-20210324213655586" style="zoom: 80%;" />

![image-20210324213814929](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324213814929.png)

导入项目到版本仓库

![image-20210324214012079](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324214012079.png)

![image-20210324214200887](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324214200887.png)

![image-20210324214342314](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324214342314.png)

`写完地址以后要添加一个目录名字，保持和项目名一致即可`

![image-20210324214419125](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324214419125.png)

![image-20210324214515174](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324214515174.png)

![image-20210324214546480](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324214546480.png)

上传成功

<img src="https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210324214829802.png" alt="image-20210324214829802" style="zoom:80%;" />

如何解决代码冲突



## **Eclipse整合SVN**

**1.安装subclipse插件**

![image-20210325081611221](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210325081611221.png)

![image-20210325081830363](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210325081830363.png)

安装的过程中，会有弹窗提示，点击继续安装，等待安装完成

2.安装完成之后，显示svn资源库的视窗

![image-20210325082013873](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210325082013873.png)

选择svn资源库

![image-20210325082039315](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210325082039315.png)

添加资源库位置

![image-20210325082133658](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210325082133658.png)

![image-20210325082245425](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210325082245425.png)

添加完成

![image-20210325082313735](https://gitee.com/yu_chao_ping/typora/raw/master/images/image-20210325082313735.png)