.class public final Lf0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf0/g$a;,
        Lf0/g$c;,
        Lf0/g$b;,
        Lf0/g$d;,
        Lf0/g$f;,
        Lf0/g$e;
    }
.end annotation


# instance fields
.field public final a:Lf0/g$e;


# direct methods
.method public constructor <init>(Lf0/g$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/g;->a:Lf0/g$e;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf0/g;->a:Lf0/g$e;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
