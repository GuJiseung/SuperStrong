.class public final Ls3/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls3/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls3/c;->a(Lw3/a;)Ls3/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ls3/n<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lq3/k;


# direct methods
.method public constructor <init>(Lq3/k;Ljava/lang/reflect/Type;)V
    .locals 0

    iput-object p1, p0, Ls3/c$a;->b:Lq3/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Ls3/c$a;->b:Lq3/k;

    invoke-interface {v0}, Lq3/k;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
