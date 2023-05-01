.class public final Lk1/m$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf2/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/m$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lf2/a$b<",
        "Lk1/n<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lk1/m$b;


# direct methods
.method public constructor <init>(Lk1/m$b;)V
    .locals 0

    iput-object p1, p0, Lk1/m$b$a;->a:Lk1/m$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 9

    new-instance v8, Lk1/n;

    iget-object v0, p0, Lk1/m$b$a;->a:Lk1/m$b;

    iget-object v1, v0, Lk1/m$b;->a:Ln1/a;

    iget-object v2, v0, Lk1/m$b;->b:Ln1/a;

    iget-object v3, v0, Lk1/m$b;->c:Ln1/a;

    iget-object v4, v0, Lk1/m$b;->d:Ln1/a;

    iget-object v5, v0, Lk1/m$b;->e:Lk1/o;

    iget-object v6, v0, Lk1/m$b;->f:Lk1/q$a;

    iget-object v7, v0, Lk1/m$b;->g:Lf2/a$c;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lk1/n;-><init>(Ln1/a;Ln1/a;Ln1/a;Ln1/a;Lk1/o;Lk1/q$a;Lf2/a$c;)V

    return-object v8
.end method
