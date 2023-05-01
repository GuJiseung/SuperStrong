.class public abstract Lb5/g$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation


# static fields
.field public static final a:Lb5/g$d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb5/g$d$a;

    invoke-direct {v0}, Lb5/g$d$a;-><init>()V

    sput-object v0, Lb5/g$d;->a:Lb5/g$d$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb5/g;)V
    .locals 0

    return-void
.end method

.method public abstract b(Lb5/r;)V
.end method
