.class public final Lt3/a;
.super Lq3/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lq3/x<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Lt3/a$a;


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final b:Lt3/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt3/a$a;

    invoke-direct {v0}, Lt3/a$a;-><init>()V

    sput-object v0, Lt3/a;->c:Lt3/a$a;

    return-void
.end method

.method public constructor <init>(Lq3/j;Lq3/x;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq3/j;",
            "Lq3/x<",
            "TE;>;",
            "Ljava/lang/Class<",
            "TE;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lq3/x;-><init>()V

    new-instance v0, Lt3/n;

    invoke-direct {v0, p1, p2, p3}, Lt3/n;-><init>(Lq3/j;Lq3/x;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Lt3/a;->b:Lt3/n;

    iput-object p3, p0, Lt3/a;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a(Lx3/a;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p1}, Lx3/a;->M()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lx3/a;->I()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lx3/a;->c()V

    :goto_0
    invoke-virtual {p1}, Lx3/a;->q()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lt3/a;->b:Lt3/n;

    invoke-virtual {v1, p1}, Lt3/n;->a(Lx3/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lx3/a;->k()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    iget-object v1, p0, Lt3/a;->a:Ljava/lang/Class;

    invoke-static {v1, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-object v1
.end method

.method public final b(Lx3/c;Ljava/lang/Object;)V
    .locals 4

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lx3/c;->q()Lx3/c;

    return-void

    :cond_0
    invoke-virtual {p1}, Lx3/c;->f()V

    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-static {p2, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lt3/a;->b:Lt3/n;

    invoke-virtual {v3, p1, v2}, Lt3/n;->b(Lx3/c;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lx3/c;->k()V

    return-void
.end method
