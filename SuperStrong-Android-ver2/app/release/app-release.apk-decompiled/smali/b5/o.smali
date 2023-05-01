.class public final Lb5/o;
.super Lw4/b;
.source "SourceFile"


# instance fields
.field public final synthetic c:Lb5/g$f;


# direct methods
.method public varargs constructor <init>(Lb5/g$f;[Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lb5/o;->c:Lb5/g$f;

    const-string p1, "OkHttp %s settings"

    invoke-direct {p0, p1, p2}, Lw4/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lb5/o;->c:Lb5/g$f;

    iget-object v0, v0, Lb5/g$f;->d:Lb5/g;

    iget-object v1, v0, Lb5/g;->c:Lb5/g$d;

    invoke-virtual {v1, v0}, Lb5/g$d;->a(Lb5/g;)V

    return-void
.end method
