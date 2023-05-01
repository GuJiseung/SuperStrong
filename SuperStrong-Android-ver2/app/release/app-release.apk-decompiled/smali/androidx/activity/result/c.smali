.class public abstract Landroidx/activity/result/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:Lx3/a$a;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static g(Ljava/lang/Class;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isInterface(I)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v1, "Abstract class can\'t be instantiated! Class name: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v1, "Interface can\'t be instantiated! Interface name: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public abstract j(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
.end method

.method public abstract k(FFFF)Landroid/graphics/Path;
.end method

.method public abstract p(Ljava/lang/Class;)Ljava/lang/Object;
.end method

.method public abstract u(I)Landroid/view/View;
.end method

.method public abstract w(I)V
.end method

.method public abstract x(Landroid/graphics/Typeface;Z)V
.end method

.method public abstract y()Z
.end method

.method public abstract z(Landroid/content/Intent;I)Ljava/lang/Object;
.end method
