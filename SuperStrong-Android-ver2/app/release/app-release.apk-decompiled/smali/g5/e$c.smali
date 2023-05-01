.class public final Lg5/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg5/e$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lg5/c<",
        "TR;",
        "Ljava/util/concurrent/CompletableFuture<",
        "Lg5/b0<",
        "TR;>;>;>;"
    }
.end annotation

.annotation build Lorg/codehaus/mojo/animal_sniffer/IgnoreJRERequirement;
.end annotation


# instance fields
.field public final a:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/e$c;->a:Ljava/lang/reflect/Type;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lg5/e$c;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public final b(Lg5/t;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lg5/e$b;

    invoke-direct {v0, p1}, Lg5/e$b;-><init>(Lg5/t;)V

    new-instance v1, Lg5/e$c$a;

    invoke-direct {v1, v0}, Lg5/e$c$a;-><init>(Lg5/e$b;)V

    invoke-virtual {p1, v1}, Lg5/t;->k(Lg5/d;)V

    return-object v0
.end method
