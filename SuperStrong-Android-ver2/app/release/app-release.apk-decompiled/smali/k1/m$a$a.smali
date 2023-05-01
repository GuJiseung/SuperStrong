.class public final Lk1/m$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf2/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/m$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lf2/a$b<",
        "Lk1/j<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lk1/m$a;


# direct methods
.method public constructor <init>(Lk1/m$a;)V
    .locals 0

    iput-object p1, p0, Lk1/m$a$a;->a:Lk1/m$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lk1/j;

    iget-object v1, p0, Lk1/m$a$a;->a:Lk1/m$a;

    iget-object v2, v1, Lk1/m$a;->a:Lk1/j$d;

    iget-object v1, v1, Lk1/m$a;->b:Lf2/a$c;

    invoke-direct {v0, v2, v1}, Lk1/j;-><init>(Lk1/j$d;Lf2/a$c;)V

    return-object v0
.end method
