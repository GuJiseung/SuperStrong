.class public final Ll1/m$c;
.super Ll1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll1/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll1/c<",
        "Ll1/m$b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll1/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ll1/l;
    .locals 1

    new-instance v0, Ll1/m$b;

    invoke-direct {v0, p0}, Ll1/m$b;-><init>(Ll1/m$c;)V

    return-object v0
.end method
